package triet.drug.management;

import triet.drug.management.models.Drug;
import triet.drug.management.models.DrugList;

import java.util.Scanner;

public class Test {
    private static final DrugList myDrugList = new DrugList();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Drug drug1 = new Drug(13734, "Acyclovir", 200, 400, 1000, "23/02/2020", "23/02/2023");
        Drug drug2 = new Drug(28984, "Penicillin", 250, 300, 450, "07/08/2021", "07/08/2022");
        Drug drug3 = new Drug(77456, "Chloramphenicol", 250, 750, 780, "12/09/2021", "12/09/2022");
        Drug drug4 = new Drug(81569, "Vitamin C", 1000, 500, 300, "06/12/2020", "06/12/2023");
        Drug drug5 = new Drug(02145, "Mebendazole", 500, 350, 1000, "07/03/2022", "07/03/2024");
        Drug drug6 = new Drug(34525, "Vitamin E", 500, 600, 650, "15/05/2020", "15/05/2023");
        myDrugList.addNewDrug(drug1, drug2, drug3, drug4, drug5, drug6);
        chooseInMenu();
    }

    private static void showMenu() {
        System.out.println(" __________________________________________________________ ");
        System.out.println("|    << MENU >>                                            |");
        System.out.println("|                                                          |");
        System.out.println("|    1. Add new drug.                                      |");
        System.out.println("|    2. Show drug list.                                    |");
        System.out.println("|    3. Check drug list is empty or not.                   |");
        System.out.println("|    4. Get the number of drugs in list.                   |");
        System.out.println("|    5. Empty drug list.                                   |");
        System.out.println("|    6. Check a drug is existed or not (by ID).            |");
        System.out.println("|    7. Remove a drug from the list (by ID).               |");
        System.out.println("|    8. Search drug name.                                  |");
        System.out.println("|    9. Sort drug list.                                    |");
        System.out.println("|    0. Exit.                                              |");
        System.out.println("|__________________________________________________________|");
    }

    public static char chooseAction() {
        System.out.print("Your choice is: ");
        return input.next().charAt(0);
    }

    public static void chooseInMenu() {
        do {
            showMenu();
            try {
                char character = chooseAction();
                if (character == '1') {
                    myDrugList.addNewDrug(getNewDrug());
                    returnOrExit(1);
                    break;
                }
                if (character == '2') {
                    myDrugList.showDrugList();
                    returnOrExit(1);
                    break;
                }
                if (character == '3') {
                    System.out.println(myDrugList.isEmptyList() ? "===> No drug in list" : "===> Available drug in list");
                    returnOrExit(1);
                    break;
                }
                if (character == '4') {
                    int size = myDrugList.getTheNumberOfDrugs();
                    System.out.printf("===> There %s %d %s in list.\n", size > 1 ? "are" : "is", size, size > 1 ? "drugs" : "drug");
                    returnOrExit(1);
                    break;
                }
                if (character == '5') {
                    myDrugList.removeAllDrugs();
                    System.out.println("===> All drugs are removed successfully from the list.");
                    returnOrExit(1);
                    break;
                }
                if (character == '6') {
                    System.out.println(myDrugList.isExistedInList() ? "Drug is available in list." : "Sorry, drug is not available.");
                    returnOrExit(1);
                    break;
                }
                if (character == '7') {
                    System.out.println(myDrugList.removeDrugFromList() ? "Drug is removed successfully" : "Sorry, drug is not available.");
                    returnOrExit(1);
                    break;
                }
                if (character == '8') {
                    System.out.println(myDrugList.searchDrugName());
                    returnOrExit(1);
                    break;
                }
                if (character == '9') {
                    chooseSortType();
                    returnOrExit(1);
                    break;
                }
                if (character == '0') {
                    System.exit(0);
                    break;
                }
                System.out.println("Invalid choice. Please try again!");
            } catch (Exception io) {
                System.out.println("Invalid choice. Please try again!");
            }
        } while (true);
    }

    public static void returnOrExit(int num) {
        do {
            System.out.println();
            System.out.println("Do you want to go back to Homepage or exit?");
            System.out.println("(Enter '1' to go back or '2' to exit)");
            try {
                char character = chooseAction();
                if (character == '1') {
                    if (num == 1)
                    chooseInMenu();
                    else chooseSortType();
                    break;
                }
                if (character == '2') {
                    System.exit(0);
                    break;
                }
                System.out.println("Invalid choice. Please try again!");
            } catch (Exception io) {
                System.out.println("Invalid choice. Please try again!");
            }
        } while (true);
    }

    public static Drug getNewDrug() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter all information below:");
        System.out.println();
        long id = System.currentTimeMillis() / 100000000;
        System.out.println("Drug ID: " + id);
        System.out.print("Drug Name: ");
        String drugName = input.next();
        System.out.print("Drug Content (mg): ");
        int drugContent = input.nextInt();
        System.out.print("Quantity (tablet): ");
        int quantity = input.nextInt();
        System.out.print("Price Per Tablet: ");
        double pricePerTablet = input.nextDouble();
        System.out.print("Production Date: ");
        String productionDate = input.next();
        System.out.print("Expiration Date: ");
        String expirationDate = input.next();
        System.out.println();
        System.out.println("Added successfully!");
        return new Drug(id, drugName, drugContent, quantity, pricePerTablet, productionDate, expirationDate);
    }

    public static void showSortMenu() {
        System.out.println(" _____________________________");
        System.out.println("|                             |");
        System.out.println("|    Sort Drug List by        |");
        System.out.println("|                             |");
        System.out.println("|    1. Drug name.            |");
        System.out.println("|    2. Quantity.             |");
        System.out.println("|    3. Price per tablet.     |");
        System.out.println("|    4. Production date.      |");
        System.out.println("|    5. Expiration date.      |");
        System.out.println("|    6. Return.               |");
        System.out.println("|    0. Exit.                 |");
        System.out.println("|                             |");
        System.out.println("|_____________________________|");
    }

    public static void chooseSortType() {
        do {
            showSortMenu();
            try {
                char character = chooseAction();
                if (character == '1') {
                    myDrugList.sortByDrugName();
                    myDrugList.showDrugList();
                    returnOrExit(0);
                    break;
                }
                if (character == '2') {
                    myDrugList.sortByQuantity();
                    myDrugList.showDrugList();
                    returnOrExit(0);
                    break;
                }
                if (character == '3') {
                    myDrugList.sortByPricePerTablet();
                    myDrugList.showDrugList();
                    returnOrExit(0);
                    break;
                }
                if (character == '4') {
                    myDrugList.sortByProductionDate();
                    myDrugList.showDrugList();
                    returnOrExit(0);
                    break;
                }
                if (character == '5') {

                    returnOrExit(0);
                    break;
                }
                if (character == '6') {
                    chooseInMenu();
                    break;
                }
                if (character == '0') {
                    System.exit(0);
                    break;
                }
                System.out.println("Invalid choice. Please try again!");
            } catch (Exception io) {
                System.out.println("Invalid choice. Please try again!");
            }
        } while (true);
    }


}
