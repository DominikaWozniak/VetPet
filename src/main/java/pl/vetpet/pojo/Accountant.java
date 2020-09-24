package pl.vetpet.pojo;

import java.util.List;

public class Accountant {

    private Long id;
    private UserDetails userDetails;
    private WorkerPersonalData workerPersonalData;
    private List<Task> tasks;
    private List<Invoice> invoices;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public WorkerPersonalData getWorkerPersonalData() {
        return workerPersonalData;
    }

    public void setWorkerPersonalData(WorkerPersonalData workerPersonalData) {
        this.workerPersonalData = workerPersonalData;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
