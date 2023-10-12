package com.example.visitor;

public class HardDisk implements ComputerComponent {
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }

    public String getInfo() {
        return "1TB SSD";
    }
}
