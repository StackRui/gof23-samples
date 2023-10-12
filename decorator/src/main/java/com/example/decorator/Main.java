package com.example.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("===来一棵圣诞树===");
        Tree christmasTree = new ChristmasTree();
        System.out.println(christmasTree.getMessage() + "，总价格：" + christmasTree.getPrice() + "元。");

        System.out.println("===加些圣诞球吧===");
        christmasTree = new BallDecorator(christmasTree);
        System.out.println(christmasTree.getMessage() + "，总价格：" + christmasTree.getPrice() + "元。");

        System.out.println("===再加些缎带吧===");
        christmasTree = new RibbonDecorator(christmasTree);
        System.out.println(christmasTree.getMessage() + "，总价格：" + christmasTree.getPrice() + "元。");
    }
}
