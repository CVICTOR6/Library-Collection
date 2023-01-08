package org.example.Models;

import java.util.ArrayList;
import java.util.List;

public class Library extends Book{
    List<Book> bookList;


    public Library(String bookName, int bookAmount, boolean isAvailable) {
        super(bookName, bookAmount, isAvailable);
    }
}
