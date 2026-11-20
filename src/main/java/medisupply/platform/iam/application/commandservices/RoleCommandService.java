package medisupply.platform.iam.application.commandservices;
import medisupply.platform.iam.application.commands.SeedRolesCommand;
public interface RoleCommandService {

    void handle (SeedRolesCommand command);
}
