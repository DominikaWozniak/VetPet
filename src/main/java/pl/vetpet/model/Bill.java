package pl.vetpet.model;

import java.util.Date;

public class Bill {

    private Long id;
    private Visit visit;
    private Date dateOfIssue;
    private String treatmentName;
    private Float totalGross;
    private Owner owner;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Float getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(Float totalGross) {
        this.totalGross = totalGross;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
