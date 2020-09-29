package pl.vetpet.service;

import java.sql.SQLException;

public interface MenuService {

    void mainMenu() throws SQLException;

    void checkUserPermission();

    void adminMenu();

    void vetMenu();

    void accountantMenu();
}
