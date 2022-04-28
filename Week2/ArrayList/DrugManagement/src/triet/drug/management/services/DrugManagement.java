package triet.drug.management.services;

import triet.drug.management.models.Drug;

import java.util.ArrayList;
import java.util.List;

public class DrugManagement implements IDrugManagement {
    private List<Drug> drugList;

    public DrugManagement() {
        this.drugList = new List<Drug>() {
        };
    }

    @Override
    public List<Drug> getDugList() {
        return this.drugList;
    }

    @Override
    public void addDrug(Drug newDrug) {
        drugList.add(newDrug);
    }

    @Override
    public void removeDrugById(int id) {
        drugList.remove(id);
    }

    @Override
    public void update(Drug drug) {

    }

    @Override
    public boolean isIdExisted(long id) {
        return drugList.contains(new Drug(id));
    }

    @Override
    public Drug getDrugById(long id) {
        return drugList.get((int) id);
    }
}
