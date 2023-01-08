package org.example.service;

import org.example.Models.Book;
import org.example.Models.User;

import java.util.*;

public class BookRequestImplementation implements BookRequestService  {
    Queue<User> bookRequestFirst = new PriorityQueue<>();

    public void bookRequestRegular (User user, List<Book> bookList, Book userBook) {
        if (bookCheck(user, bookList, userBook)){
            bookRequestFirst.offer(user);
        }
    }

    Deque<User> book = new ArrayDeque<>();
    public  void bookRequest (User user, List<Book> bookList, Book userBook) {
        if (bookCheck(user, bookList, userBook)) {
            if (user.getPriority() == 3) {
                book.offerFirst(user);
            } else if (user.getPriority() == 2) {
                book.offer(user);
            } else {
                book.offerLast(user);
            }
        }
    }
    public boolean bookCheck(User user, List<Book> bookList, Book userBook){
        for (Book book: bookList){
            if (userBook.getBookName().equalsIgnoreCase(book.getBookName()) && book.getBookAmount() >= 1){
                return true;
            }
        }
        return false;
    }

    public void administerBook(){
        User borrower = book.getFirst();
        System.out.println("Book was administered to " + borrower.getName());
    }

    public void administerBookFirst(){
        User borrower = bookRequestFirst.remove();
        System.out.println("Book was administered to " + borrower.getName());
    }

}

