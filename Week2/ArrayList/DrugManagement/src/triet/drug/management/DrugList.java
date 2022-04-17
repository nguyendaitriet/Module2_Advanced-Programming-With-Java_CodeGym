package triet.drug.management;

import java.util.ArrayList;
import java.util.Collections;

public class DrugList{
    private ArrayList<Drug> drugList;

    public DrugList() {
        this.drugList = new ArrayList<Drug>();
    }

    public DrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public void addNewDrug(Drug ... newDrug) {
        Collections.addAll(this.drugList, newDrug);
//        for (Drug drug:newDrug) {
//            this.drugList.add(drug);
//        }
    }
    public void addNewDrug(long id, String drugName, int drugContent, int quantity, double pricePerTablet, String productionDate, String expirationDate) {
        Drug newDrug = new Drug(id,drugName,drugContent,quantity,pricePerTablet,productionDate,expirationDate);
        this.drugList.add(newDrug);
    }

    public void showDrugList() {
        System.out.println("---------------------------------------------------------------------------- DRUG LIST ----------------------------------------------------------------------------\n");
        System.out.printf("%-15s %-20s %-25s %-25s %-25s %-25s %-25s\n", "ID", "Drug Name", "Drug Content (mg)", "Quantity (tablet)", "Price Per Tablet", "Production Date", "Expiration Date");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Drug drug : drugList) {
            System.out.printf("%-15s %-20s %-25s %-25s %-25s %-25s %-25s \n", drug.getId(), drug.getDrugName(), drug.getDrugContent(),
                    drug.getQuantity(), drug.getPricePerTablet(), drug.getProductionDate(),drug.getExpirationDate());
        }
    }

    public boolean isEmptyList() {
        return this.drugList.isEmpty();
    }

    public int getTheNumberOfDrugs() {
        return this.drugList.size();
    }

    public void removeAllDrugs() {
        this.drugList.removeAll(drugList);
    }
}
