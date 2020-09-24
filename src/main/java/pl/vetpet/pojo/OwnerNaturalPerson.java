package pl.vetpet.pojo;

import java.util.List;

public class OwnerNaturalPerson {

    private Long id;
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private List<Pet> pets;
    private List<Bill> bills;
    private boolean isLegalPerson;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public boolean isLegalPerson() {
        return isLegalPerson;
    }

    public void setLegalPerson(boolean legalPerson) {
        isLegalPerson = legalPerson;
    }
}
