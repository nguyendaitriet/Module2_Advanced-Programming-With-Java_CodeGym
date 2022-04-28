package triet.drug.management.services;

import triet.drug.management.models.Drug;

import java.util.List;

public interface IDrugManagement {
    List<Drug> getDugList();

    void addDrug (Drug newDrug);

    void removeDrugById (int id);

    void update(Drug drug);

    boolean isIdExisted(long id);

    Drug getDrugById(long id);
}
