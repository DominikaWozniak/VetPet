package pl.vetpet.pojo;

import pl.vetpet.enums.VetServicesNames;

public class PetTreatmentPrice {

    private Long id;
    private VetServicesNames vetServicesNames;
    private Float price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VetServicesNames getVetServicesNames() {
        return vetServicesNames;
    }

    public void setVetServicesNames(VetServicesNames vetServicesNames) {
        this.vetServicesNames = vetServicesNames;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
