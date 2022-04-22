import java.util.ArrayList;

public class Test {

    public static void selectionSortASCE(ArrayList<Drug> myList) {
        int min;
        for (int i = 0; i < myList.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < myList.size(); j++)
                if(myList.get(j).compareTo(myList.get(min))<0) min=j;
            if (min != i) {
                Drug temp = myList.get(min);
                myList.set(min,myList.get(i));
                myList.set(i,temp);
            }
        }
    }

    static int binarySearch(ArrayList<Drug> list, Drug drug) {
        int low = 0;
        int high = list.size() - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (drug.compareTo(list.get(mid)) < 0)
                high = mid - 1;
            else if (drug.equals(list.get(mid)))
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Drug drug1 = new Drug(1234, "Para", 230.45);
        Drug drug2 = new Drug(4436, "Beta", 342.67);
        Drug drug3 = new Drug(7331, "Cyto", 122.90);
        Drug drug4 = new Drug(2331, "Nibe", 122.90);
        Drug drug5 = new Drug(5331, "Kaki", 122.90);
        ArrayList<Drug> myList = new ArrayList<>();
        myList.add(drug1);
        myList.add(drug2);
        myList.add(drug3);
        myList.add(drug4);
        myList.add(drug5);
        System.out.println(myList);
        // Ascending Selection Sort
        selectionSortASCE(myList);
        System.out.println("New array after being sorted (ascending):");
        System.out.println(myList);
        //
        System.out.println(binarySearch(myList,new Drug("Para")));


    }
}
