package pl.vetpet.service;

import pl.vetpet.model.Visit;

public interface VisitService {

    void createNewVisit(Visit visit);

    void editVisit(Visit visit);

    void removeVisit(Visit visit);

    void findVisit(Visit visit);
}
