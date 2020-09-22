package pl.vetpet.pojo;

import pl.vetpet.enums.Specialty;

import java.util.List;

public class Vet extends BaseUser {

    private List<Specialty> specialty;
    private List<Visit> visits;

    public List<Specialty> getSpecialty() {
        return specialty;
    }

    public void setSpecialty(List<Specialty> specialty) {
        this.specialty = specialty;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}
