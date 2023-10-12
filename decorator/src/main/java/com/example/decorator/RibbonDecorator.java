package com.example.decorator;

public class RibbonDecorator extends ChristmasTreeDecorator{
    public RibbonDecorator(Tree tree) {
        super(tree);
    }
    @Override
    public String getMessage() {
        return super.getMessage()+ ", 加了缎带";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+10;
    }
}
