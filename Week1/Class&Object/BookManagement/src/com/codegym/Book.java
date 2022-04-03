package com.codegym;

public class Book {
    private String bookName;
    private double price = 0;
    private int publicationYear;
    private Author bookAuthor;

    public Book(String bookName, double price, int publicationYear, Author bookAuthor) {
        this.bookName = bookName;
        this.price = price;
        this.publicationYear = publicationYear;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (this.price > 0) {
            this.price = price;
        }
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (this.publicationYear > 0) {
            this.publicationYear = publicationYear;
        }
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public boolean checkPublicationYear(Book otherBook) {
        if (this.publicationYear == otherBook.publicationYear) {
            return true;
        }
        return false;
    }

    public double showPriceAfterDiscounting(double voucher) {
        return this.price - this.price * voucher / 100;
    }

    public void showBookName() {
        System.out.println("Book's name: " + this.bookName);
    }

}
