package pl.vetpet.service;

import pl.vetpet.model.Pet;

public interface PetService {

    void createNewPet(Pet pet);

    void editPet(Pet pet);

    void deletePet(Pet pet);

    void findPet(Pet pet);
}
