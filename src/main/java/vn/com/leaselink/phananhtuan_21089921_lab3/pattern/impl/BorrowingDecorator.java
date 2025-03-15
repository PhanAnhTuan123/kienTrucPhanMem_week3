package vn.com.leaselink.phananhtuan_21089921_lab3.pattern.impl;

import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.Borrowable;

// Decorator base class
public abstract class BorrowingDecorator implements Borrowable {
    protected Borrowable borrowable;

    public BorrowingDecorator(Borrowable borrowable) {
        this.borrowable = borrowable;
    }

    @Override
    public String borrow() {
        return borrowable.borrow();
    }

    @Override
    public int getLoanPeriod() {
        return borrowable.getLoanPeriod();
    }
}