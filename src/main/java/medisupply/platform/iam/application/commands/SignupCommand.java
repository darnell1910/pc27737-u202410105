package medisupply.platform.iam.application.commands;

import java.util.List;
public record SignupCommand(String username, String password, List<Role> roles) {
}
