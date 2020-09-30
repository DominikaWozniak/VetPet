package pl.vetpet.service.impl;

import pl.vetpet.db.QueryExecutor;
import pl.vetpet.enums.Permissions;
import pl.vetpet.model.UserDetails;
import pl.vetpet.model.WorkerPersonalData;
import pl.vetpet.service.UserService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private QueryExecutor queryExecutor;
    private Scanner scanner;
    private WorkerPersonalData workerPersonalData;

    public UserServiceImpl() {
        queryExecutor = new QueryExecutor();
        scanner = new Scanner(System.in);
        workerPersonalData = new WorkerPersonalData();
    }

    @Override
    public void userLogIn(UserDetails userDetails) {
        try {
            System.out.println("Podaj login:");
            String userLogin = scanner.nextLine();

            System.out.println("Podaj hasło:");
            String userPsw = scanner.nextLine();

            ResultSet resultSet = queryExecutor
                    .executeSelect("SELECT `login`, `password`, `permission` FROM " +
                            "`user_details` WHERE `login`=\"" + userLogin + "\" " +
                            "AND `password`=\"" + userPsw + "\"");

            resultSet.next();

            String userLoginSQL = resultSet.getString("login");
            String userPswSQL = resultSet.getString("password");
            String userPermissionSQL = resultSet.getString("permission");

            if (userLogin.equals(userLoginSQL) && userPsw.equals(userPswSQL)) {
                System.out.println("Zalogowano.");
                userDetails.setPermission(userPermissionSQL);
            } else {
                System.out.println("Niepoprawny login lub hasło. Sprawdź wielkość znaków.");
            }


        } catch (SQLException e) {
            System.out.println("Niepoprawny login lub hasło.");
        }


    }

    @Override
    public void createNewUser(UserDetails userDetails) {

        try {
            System.out.println("Podaj login, którym będziesz się logować do systemu: ");
            userDetails.setLogin(scanner.nextLine());

            ResultSet resultSet = queryExecutor.executeSelect("SELECT `login` " +
                    "FROM `user_details` WHERE `login`=\"" + userDetails.getLogin() + "\"");

            resultSet.next();
            String loginSQL = resultSet.getString("login");

            while (true) {
                if (loginSQL.equals(userDetails.getLogin())) {
                    System.out.println("Taki login jest już w użyciu. Wybierz inny:");
                    userDetails.setLogin(scanner.nextLine());
                } else {
                    break;
                }
            }

        } catch (SQLException e) {}

        while(true) {
            System.out.println("Podaj hasło: ");
            String userPsw = scanner.nextLine();

            System.out.println("Potwierdź hasło: ");
            String repeatPsw = scanner.nextLine();

            if (userPsw.equals(repeatPsw)) {
                userDetails.setPassword(userPsw);
                break;
            } else {
                System.out.println("Hasła nie są takie same. Spróbuj ponownie.");
            }
        }

        System.out.println("Wprowadź swoje uprawnienie w aplikacj: \n" +
                "1. Admin \n" +
                "2. Weterynarz \n" +
                "3. Księgowy");

        String userChoose = scanner.nextLine();

        switch (userChoose) {
            case "1":
                userDetails.setPermission(Permissions.ADMIN.toString());
                break;
            case "2":
                userDetails.setPermission(Permissions.VET.toString());
                break;
            case "3":
                userDetails.setPermission(Permissions.ACCOUNTANT.toString());
                break;
            default:
                System.out.println("Niepoprawne polecenie. Zacznij od nowa.");
                createNewUser(userDetails);
                break;
        }


        queryExecutor.executeQuery("INSERT INTO `user_details` " +
                "(`login`, `password`, `permission`) VALUES " +
                "(\"" + userDetails.getLogin() + "\"," +
                "\"" + userDetails.getPassword() + "\"," +
                "\"" + userDetails.getPermission() + "\")");

        addWorkerPersonalData(workerPersonalData);

    }

    @Override
    public void editUser(UserDetails userDetails) {

    }

    @Override
    public void addWorkerPersonalData(WorkerPersonalData workerPersonalData) {

    }

    @Override
    public void editWorkerPersonalData(WorkerPersonalData workerPersonalData) {

    }

    @Override
    public void deleteUser(UserDetails userDetails, WorkerPersonalData workerPersonalData) {

    }

    @Override
    public void findUser(UserDetails userDetails) {

    }


}
