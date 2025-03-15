package vn.com.leaselink.phananhtuan_21089921_lab3.pattern.impl;

import vn.com.leaselink.phananhtuan_21089921_lab3.entity.Book;
import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private String name;
    private List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public void update(String message) {
        System.out.println("Thông báo cho người dùng " + name + ": " + message);
    }
}