package vn.com.leaselink.phananhtuan_21089921_lab3.pattern;

import vn.com.leaselink.phananhtuan_21089921_lab3.entity.Book;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String keyword);
}
