package pl.vetpet.pojo;

import pl.vetpet.enums.PetType;

import java.util.Date;

public class Pet {

    private Long id;
    private String name;
    private PetType petType;
    private Date birthDate;
    private OwnerNaturalPerson ownerNaturalPerson;
    private LegalPerson legalPerson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
