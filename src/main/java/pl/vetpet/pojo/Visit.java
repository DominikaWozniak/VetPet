package pl.vetpet.pojo;

import java.util.Date;
import java.util.List;

public class Visit {

    private Long id;
    private Date visitDate;
    private List<Pet> pets;
    private OwnerNaturalPerson ownerNaturalPerson;
    private LegalPerson legalPerson;
    private String description;
    private List<Vet> vets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Vet> getVets() {
        return vets;
    }

    public void setVets(List<Vet> vets) {
        this.vets = vets;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public OwnerNaturalPerson getOwnerNaturalPerson() {
        return ownerNaturalPerson;
    }

    public void setOwnerNaturalPerson(OwnerNaturalPerson ownerNaturalPerson) {
        this.ownerNaturalPerson = ownerNaturalPerson;
    }

    public LegalPerson getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(LegalPerson legalPerson) {
        this.legalPerson = legalPerson;
    }
}
