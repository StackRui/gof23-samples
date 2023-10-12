package com.example.visitor;

public class Memory implements ComputerComponent {
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }

    public String getInfo() {
        return "16GB DDR4";
    }
}
