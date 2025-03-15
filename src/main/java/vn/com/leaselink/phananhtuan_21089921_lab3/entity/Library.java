package vn.com.leaselink.phananhtuan_21089921_lab3.entity;

import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.SearchStrategy;
import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.impl.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Library {
    private static Library instance;
    private List<Book> books;
    private List<Observer> observers;

    private Library() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
//        notifyObservers("Sách mới được thêm vào thư viện: " + book.getTitle());
    }

    public Book borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                return book;
            }
        }
        return null;
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
//        notifyObservers("Sách đã được trả: " + book.getTitle());
    }

    public List<Book> searchBooks(SearchStrategy strategy, String keyword) {
        return strategy.search(books, keyword);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    // Observer pattern methods
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

//    private void notifyObservers(String message) {
//        for (Observer observer : observers) {
//            observer.update(message);
//        }
//    }
}
