package com.codegym;

public class ReadThousandNumbers {

    public static void main(String[] args) {
        int number = 1719;
        int first = number / 1000;
        int second = number % 1000 / 100;
        int third = (number % 100) / 10;
        int fourth = number % 10;
        String result = null;


        if (number == 0) {
            System.out.println("Zero");
        }

        if (number > 0 && number < 10) {
            result = one2Nine(fourth);
        }

        if (number >= 10 && number < 20) {
            result = _10_to_19(fourth);
        }

        if (number > 19 && number < 100) {
            result = _20_to_99(third);
            if (fourth != 0)
                result += " " + one2Nine(fourth);

        }

        if (number > 99) {
            result = one2Nine(second) + " hundred";
            if (third != 0) {
                switch (third) {
                    case 1:
                        result += " " + _10_to_19(fourth);
                        break;
                    default:
                        result += " " + _20_to_99(third);
                        break;
                }
            }
            if (fourth != 0 && third > 1) {
                result += " " + one2Nine(fourth);
            }
        }

        if (number > 999) {
            result = one2Nine(first) + " thousand ";
            if (second != 0) {
                result += one2Nine(second) + " hundred ";
            }
            if (third != 0) {
                switch (third) {
                    case 1:
                        result += " " + _10_to_19(fourth);
                        break;
                    default:
                        result += " " + _20_to_99(third);
                        break;
                }
            }
            if (fourth != 0 && third > 1) {
                result += " " + one2Nine(fourth);
            }
        }
        System.out.println(result);
    }

    public static String _20_to_99(int number) {
        String read = null;
        switch (number) {
            case 2:
                read = "Twenty";
                break;
            case 3:
                read = "Thirty";
                break;
            case 4:
                read = "Forty";
                break;
            case 5:
                read = "Fifty";
                break;
            case 6:
                read = "Sixty";
                break;
            case 7:
                read = "Seventy";
                break;
            case 8:
                read = "Eighty";
                break;
            case 9:
                read = "Ninety";
                break;
        }
        return read;
    }

    public static String _10_to_19(int number) {
        String special = null;
        switch (number) {
            case 0:
                special = "Ten";
                break;
            case 1:
                special = "Eleven";
                break;
            case 2:
                special = "Twelve";
                break;
            case 3:
                special = "Thirteen";
                break;
            case 4:
                special = "Fourteen";
                break;
            case 5:
                special = "Fifteen";
                break;
            case 6:
                special = "Sixteen";
                break;
            case 7:
                special = "Seventeen";
                break;
            case 8:
                special = "Eighteen";
                break;
            case 9:
                special = "Nineteen";
                break;
        }
        return special;
    }

    public static String one2Nine(int number) {
        String oneToNine = null;
        switch (number) {
            case 1:
                oneToNine = "One";
                break;
            case 2:
                oneToNine = "Two";
                break;
            case 3:
                oneToNine = "Three";
                break;
            case 4:
                oneToNine = "Four";
                break;
            case 5:
                oneToNine = "Five";
                break;
            case 6:
                oneToNine = "Six";
                break;
            case 7:
                oneToNine = "Seven";
                break;
            case 8:
                oneToNine = "Eight";
                break;
            case 9:
                oneToNine = "Nine";
                break;
        }
        return oneToNine;
    }
}
