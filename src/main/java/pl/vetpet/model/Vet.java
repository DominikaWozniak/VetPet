package pl.vetpet.model;

public class Vet{

    private Long id;
    private WorkerPersonalData workerPersonalData;
    private UserDetails userDetails;
    private String specialty;

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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
