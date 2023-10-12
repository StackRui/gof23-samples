package com.example.decorator;

public class ChristmasTree extends Tree{
    @Override
    public String getMessage() {
        return "这是一颗圣诞树";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
