package pl.vetpet.service;

import pl.vetpet.model.UserDetails;
import pl.vetpet.model.WorkerPersonalData;

import java.sql.SQLException;

public interface UserService {

    void userLogIn(UserDetails userDetails) throws SQLException;

    void createNewUser(UserDetails userDetails);

    void editUser(UserDetails userDetails);

    void addWorkerPersonalData(WorkerPersonalData workerPersonalData);

    void editWorkerPersonalData(WorkerPersonalData workerPersonalData);

    void deleteUser(UserDetails userDetails, WorkerPersonalData workerPersonalData);

    void findUser(UserDetails userDetails);

}
