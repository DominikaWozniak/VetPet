package pl.vetpet.pojo;

import java.util.List;

public class Accountant extends BaseUser {

    private List<Task> tasks;
    private List<Invoice> invoices;


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
