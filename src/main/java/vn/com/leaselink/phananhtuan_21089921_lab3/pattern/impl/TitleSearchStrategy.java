package vn.com.leaselink.phananhtuan_21089921_lab3.pattern.impl;

import vn.com.leaselink.phananhtuan_21089921_lab3.entity.Book;
import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.SearchStrategy;

import java.util.ArrayList;
import java.util.List;

public class TitleSearchStrategy implements SearchStrategy {

    @Override
    public List<Book> search(List<Book> books, String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

}
