package medisupply.platform.iam.domain.repositories;
import medisupply.platform.iam.domain.model.aggregates.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User>findByID(Long id);
    Optional<User>findByUsername(String username);
    List<User> findAll();
    User save (User user);
    boolean existsByUsername (String username);

}
