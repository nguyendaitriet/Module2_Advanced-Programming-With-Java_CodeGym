package vn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> newList = new MyList<Integer>();
        newList.addElementFromFirst(1,4,6,7,8,1,4);
        System.out.println(newList);
        System.out.println(newList.getElementByIndex(2));
        System.out.println(newList.getElementByIndex(-2));
    }
}

