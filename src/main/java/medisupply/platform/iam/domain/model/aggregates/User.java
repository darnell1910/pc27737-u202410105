package medisupply.platform.iam.domain.model.aggregates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class User {

    private Long id;
    private String username;
    private String password;
    private Set<Role> roles;

    private User(){
    this.roles=new HashSet<>();
    }
}
