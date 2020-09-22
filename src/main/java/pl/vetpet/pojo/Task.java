package pl.vetpet.pojo;

import java.util.Date;

public class Task {

    private Long id;
    private String description;
    private Date dateToDoTask;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateToDoTask() {
        return dateToDoTask;
    }

    public void setDateToDoTask(Date dateToDoTask) {
        this.dateToDoTask = dateToDoTask;
    }
}
