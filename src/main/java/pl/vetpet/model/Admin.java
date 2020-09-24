package pl.vetpet.model;

public class Admin {

    private Long id;
    private WorkerPersonalData workerPersonalData;
    private UserDetails userDetails;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WorkerPersonalData getWorkerPersonalData() {
        return workerPersonalData;
    }

    public void setWorkerPersonalData(WorkerPersonalData workerPersonalData) {
        this.workerPersonalData = workerPersonalData;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
