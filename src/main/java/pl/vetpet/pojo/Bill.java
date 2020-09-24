package pl.vetpet.pojo;

import java.util.Date;
import java.util.List;

public class Bill {

    private Long id;
    private Visit visit;
    private Date dateOfIssue;
    private OwnerNaturalPerson ownerNaturalPerson;
    private Float totalGross;
    private List<PetTreatmentPrice> petTreatmentPrices;

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

    public OwnerNaturalPerson getOwnerNaturalPerson() {
        return ownerNaturalPerson;
    }

    public void setOwnerNaturalPerson(OwnerNaturalPerson ownerNaturalPerson) {
        this.ownerNaturalPerson = ownerNaturalPerson;
    }

    public Float getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(Float totalGross) {
        this.totalGross = totalGross;
    }

    public List<PetTreatmentPrice> getPetTreatmentPrices() {
        return petTreatmentPrices;
    }

    public void setPetTreatmentPrices(List<PetTreatmentPrice> petTreatmentPrices) {
        this.petTreatmentPrices = petTreatmentPrices;
    }
}
