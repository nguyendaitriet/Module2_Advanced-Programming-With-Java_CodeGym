package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Type a positive number: ");
        int number = input.nextInt();
        int situation = number < 0 ? 0 : number < 10 ? 1 : number < 20 ? 2 : number < 100 ? 3 : number < 1000 ? 4 : number;

        switch (situation) {
            int firstDigit = number / 100;
            int secondDigit = number / 10 % 10;
            int thirdDigit = number % 10;
            String first = "";
            String second = "";
            String third = "";
            case 1: {
                switch (number) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
            break;

            case 2: {
                int secondDigit = number % 10;
                switch (secondDigit) {
                    case 0:
                        System.out.println("Ten");
                        break;
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            }
            break;

            case 3: {
                int firstDigit = number / 10;
                int secondDigit = number % 10;
                String first = "", second = "";
                switch (firstDigit) {
                    case 2:
                        first = "Twenty";
                        break;
                    case 3:
                        first = "Thirty";
                        break;
                    case 4:
                        first = "Forty";
                        break;
                    case 5:
                        first = "Fifty";
                        break;
                    case 6:
                        first = "Sixty";
                        break;
                    case 7:
                        first = "Seventy";
                        break;
                    case 8:
                        first = "Eighty";
                        break;
                    case 9:
                        first = "Ninety";
                        break;
                }
                switch (secondDigit) {
                    case 1:
                        second = "One";
                        break;
                    case 2:
                        second = "Two";
                        break;
                    case 3:
                        second = "Three";
                        break;
                    case 4:
                        second = "Four";
                        break;
                    case 5:
                        second = "Five";
                        break;
                    case 6:
                        second = "Six";
                        break;
                    case 7:
                        second = "Seven";
                        break;
                    case 8:
                        second = "Eight";
                        break;
                    case 9:
                        second = "Nine";
                        break;
                }
                System.out.println(first + " " + second);
            }
            break;

            case 4: {

            }

            case 0:
            default:
                System.out.println("Out of ability");
                break;
        }
    }
}
