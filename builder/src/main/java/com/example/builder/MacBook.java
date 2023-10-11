package com.example.builder;

public class MacBook extends Computer{


    protected MacBook() {
    }

    @Override
    public void setOs() {
        mOs="Mac OS X 12";
    }
}
