package org.example.Models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String bookName;
    private int bookAmount;
    private boolean isAvailable;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(int bookAmount) {
        this.bookAmount = bookAmount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Book(String bookName, int bookAmount, boolean isAvailable) {
        this.bookName = bookName;
        this.bookAmount = bookAmount;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAmount=" + bookAmount +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
