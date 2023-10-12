package com.example.decorator;

public class BallDecorator extends ChristmasTreeDecorator{
    public BallDecorator(Tree tree) {
        super(tree);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+ ", 加了装饰球";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+20;
    }
}
