package com.codegym;

public class Main {

    public static void main(String[] args) {
        Fan myFan1 = new Fan();
        Fan myFan2 = new Fan();

        myFan1.setSpeed(3);
        myFan1.setRadius(10);
        myFan1.setColor("Yellow");
        myFan1.setOn(true);
        System.out.println(myFan1.informationAboutFan());
        System.out.println(myFan2.informationAboutFan());
    }
}
