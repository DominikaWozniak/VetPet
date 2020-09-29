package pl.vetpet.service.impl;

import pl.vetpet.db.QueryExecutor;
import pl.vetpet.model.UserDetails;
import pl.vetpet.model.WorkerPersonalData;
import pl.vetpet.service.UserService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private QueryExecutor queryExecutor;
    private Scanner scanner;

    public UserServiceImpl() {
        queryExecutor = new QueryExecutor();
        scanner = new Scanner(System.in);
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
