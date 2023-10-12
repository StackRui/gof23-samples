package com.example.visitor;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.addComponent(new CPU());
        computer.addComponent(new Memory());
        computer.addComponent(new HardDisk());

        ComputerVisitor visitor = new ComputerInfoVisitor();
        computer.accept(visitor);
    }
}
