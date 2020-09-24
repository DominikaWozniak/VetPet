package pl.vetpet.model;

public class WorkRegister {

    private Long id;
    private Float hours;
    private String month;
    private Float salary;
    private WorkerPersonalData workerPersonalData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getHours() {
        return hours;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public WorkerPersonalData getWorkerPersonalData() {
        return workerPersonalData;
    }

    public void setWorkerPersonalData(WorkerPersonalData workerPersonalData) {
        this.workerPersonalData = workerPersonalData;
    }
}
