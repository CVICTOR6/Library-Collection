package org.example;

import org.example.Enums.UserType;
import org.example.service.BookRequestImplementation;
import org.example.Models.Book;
import org.example.Models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Collections", 5, true);
        Book book2 = new Book("Big O Notation", 4, true);
        Book book3 = new Book("Introduction to Java Fundamentals", 7, true);
        Book book4 = new Book("Data Structures in Java", 3, true);
        Book book5 = new Book("Frontend React Development", 2, true);

        User user1 = new User("Fred", UserType.SENIOR_STUDENT );
        User user2 = new User("Monica", UserType.JUNIOR_STUDENT);
        User user3 = new User("Mr Amadi", UserType.TEACHER);



        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5));

        BookRequestImplementation bookRequestImplementation = new BookRequestImplementation();

        user1.makeBookRequest(bookList, book1);
        bookRequestImplementation.bookRequest(user1, bookList, book1);
        bookRequestImplementation.bookRequest(user3, bookList, book1);
        bookRequestImplementation.bookRequest(user2, bookList, book1);


        bookRequestImplementation.bookRequestRegular(user1, bookList, book1);
        bookRequestImplementation.bookRequestRegular(user3, bookList, book1);
        bookRequestImplementation.bookRequestRegular(user2, bookList, book1);


//        bookRequestImplementation.administerBook();
        bookRequestImplementation.administerBook();
        bookRequestImplementation.administerBookFirst();
        // done
    }


}