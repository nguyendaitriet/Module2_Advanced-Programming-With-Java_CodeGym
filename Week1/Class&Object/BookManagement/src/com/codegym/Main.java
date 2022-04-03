package com.codegym;

public class Main {

    public static void main(String[] args) {
        Date myDate1 = new Date(13,02,1976);
        Date myDate2 = new Date(21,10,1988);
        Date myDate3 = new Date(9,04,1997);

        Author person1 = new Author("John Smith", myDate1);
        Author person2 = new Author("Taylor Mark", myDate2);
        Author person3 = new Author("Williams Sue", myDate3);

        Book book1 = new Book("Discovery", 15000, 2008, person1);
        Book book2 = new Book("Science", 500000, 2021, person2);
        Book book3 = new Book("Science", 75000, 2008, person3);

        book1.showBookName();
        book2.showBookName();
        if (book1.checkPublicationYear(book2)) {
            System.out.println("2 books have the same publication year!");
        } else {
            System.out.println("2 books have different publication year!");
        }

        double newPrice1 = book1.showPriceAfterDiscounting(30.5);
        System.out.println("Price of " + book1.getBookName() + " after discounting: " + newPrice1);
    }
}
