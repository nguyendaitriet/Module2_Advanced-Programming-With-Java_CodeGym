package vn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> newList = new MyList<>(5);
        newList.addElementFromFirst(1,4,6,7,8,9,12,-1);
        System.out.println(newList);
        System.out.println(newList.getElementByIndex(2));
//        System.out.println(newList.getElementByIndex(-2));
    }
}

