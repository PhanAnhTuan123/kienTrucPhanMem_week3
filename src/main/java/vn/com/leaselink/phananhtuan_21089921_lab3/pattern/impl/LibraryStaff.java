package vn.com.leaselink.phananhtuan_21089921_lab3.pattern.impl;

import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.Observer;

public class LibraryStaff implements Observer {
    private String name;

    public LibraryStaff(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Thông báo cho nhân viên " + name + ": " + message);
    }
}
