package com.example.builder;

public class Director {
    Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }


    public void construct(String board, String display) {
        builder.buildDisplay(display + "免费升级款");
        builder.buildBoard(board + "最新款");
        builder.buildOs();
    }
}
