package vn.com.leaselink.phananhtuan_21089921_lab3.pattern.impl;

import vn.com.leaselink.phananhtuan_21089921_lab3.pattern.Borrowable;

public class ExtendedLoanDecorator extends BorrowingDecorator {
    private int additionalDays;

    public ExtendedLoanDecorator(Borrowable borrowable, int additionalDays) {
        super(borrowable);
        this.additionalDays = additionalDays;
    }

    @Override
    public String borrow() {
        return borrowable.borrow() + " với thời gian mượn được gia hạn";
    }

    @Override
    public int getLoanPeriod() {
        return borrowable.getLoanPeriod() + additionalDays;
    }
}