package org.example.service;

import org.example.Models.Book;
import org.example.Models.User;

import java.util.List;

public interface BookRequestService {
   boolean bookCheck(User user, List<Book> bookList, Book userBook);


}
