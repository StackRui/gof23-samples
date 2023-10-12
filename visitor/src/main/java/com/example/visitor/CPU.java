package com.example.visitor;

public class CPU implements ComputerComponent {
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }

    public String getInfo() {
        return "Intel Core i7";
    }
}
