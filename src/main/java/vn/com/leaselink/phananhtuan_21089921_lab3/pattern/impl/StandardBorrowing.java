package vn.com.leaselink.phananhtuan_21089921_lab3.pattern.impl;

import vn.com.leaselink.phananhtuan_21089921_lab3.entity.Book;
import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.Borrowable;

public class StandardBorrowing implements Borrowable {
    private Book book;
    private User user;

    public StandardBorrowing(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    @Override
    public String borrow() {
        return "Mượn sách chuẩn: " + book.getTitle() + " cho " + user.getName();
    }

    @Override
    public int getLoanPeriod() {
        return 14; // 14 ngày mặc định
    }
}
