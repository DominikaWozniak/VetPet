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

    public UserServiceImpl(){
        queryExecutor = new QueryExecutor();
        scanner = new Scanner(System.in);
    }

    @Override
    public void userLogIn(){
        String userLogin = scanner.nextLine();
        String userPsw = scanner.nextLine();

        try {
            ResultSet resultSet = queryExecutor.executeSelect("SELECT * FROM `user_details` WHERE `login`=\"" + userLogin + "\" " +
                    "AND `password`=\"" + userPsw + "\"");
            resultSet.next();
            String userName = resultSet.getString("login");
            String password = resultSet.getString("password");
            System.out.println(userName + " " + password);
        } catch (SQLException e)
        {
            e.printStackTrace();
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
