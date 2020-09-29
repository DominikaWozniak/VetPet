package pl.vetpet.service;

import pl.vetpet.model.LegalPerson;
import pl.vetpet.model.Owner;

public interface OwnerService {

    void createNewOwner(Owner owner);

    void editOwner(Owner owner);

    void createLegalPerson(Owner owner, LegalPerson legalPerson);

    void editLegalPerson(LegalPerson legalPerson);

    void deleteOwner(Owner owner);

    void deleteLegalPerson(LegalPerson legalPerson);
}
