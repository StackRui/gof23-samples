package com.example.decorator;

public abstract class ChristmasTreeDecorator extends Tree{
    //静态代理
    private final Tree tree;

    public ChristmasTreeDecorator(Tree tree){
        this.tree=tree;
    }

    @Override
    public String getMessage() {
        return this.tree.getMessage();
    }

    @Override
    public int getPrice() {
        return this.tree.getPrice();
    }
}
