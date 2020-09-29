import pl.vetpet.service.UserService;
import pl.vetpet.service.impl.UserServiceImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();

        userService.userLogIn();
    }
}
