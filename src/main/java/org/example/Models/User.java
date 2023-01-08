package org.example.Models;

import org.example.Enums.UserType;
import org.example.service.BookRequestImplementation;

import java.util.List;

public class User implements Comparable<User>{
    private String name;
    private int age;

    private UserType userType;

    private int priority;


    public User(String name, UserType userType) {
        this.name = name;
        this.userType = userType;

        if (userType == UserType.TEACHER){this.priority = 3;}
        if (userType == UserType.SENIOR_STUDENT){this.priority = 2;}
        if (userType == UserType.JUNIOR_STUDENT){this.priority = 1;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    @Override
    public int compareTo(User o) {
        if(this.userType.equals(UserType.TEACHER) && (o.userType.equals(UserType.SENIOR_STUDENT) || o.userType.equals(UserType.JUNIOR_STUDENT))) {
            return 1;
        } else if (this.userType.equals(UserType.SENIOR_STUDENT) && (o.userType.equals(UserType.TEACHER) || o.userType.equals(UserType.JUNIOR_STUDENT))) {
            return 1;
        }else {
            return 1;
        }
    }

    public void makeBookRequest (List<Book> bookList, Book userBook){
        new BookRequestImplementation().bookRequest(this, bookList,userBook);
    }
}
