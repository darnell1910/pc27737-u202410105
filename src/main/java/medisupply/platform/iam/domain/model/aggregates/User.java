package medisupply.platform.iam.domain.model.aggregates;
import medisupply.platform.iam.domain.model.entities.Role;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class User {

    private Long id;
    private String username;
    private String password;
    private Set<Role>roles;

    private User(){
        this.roles=new HashSet<>();
    }

    public User(String username, String password){
        if (username == null|| username.isBlank()){
            throw new IllegalArgumentException("Username must not be blank");
        }

        if (password==null||password.isBlank()){
            throw new IllegalArgumentException("Encoded password must not be blank");
        }
        this.username=username;
        this.password=password;
        this.roles = new HashSet<>();
    }
    public User(String username, String password, List<Role>roles){
        this(username,password);

    }

    public static User reconstitute(Long id, String username, String password, Set<Role>roles){
        var user=new User (username, password);
        user.id=id;
        user.roles = roles != null?new HashSet<>(roles):new HashSet<>();
        return user;
    }


}
