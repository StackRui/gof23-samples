package com.example.visitor;

public interface ComputerComponent {
    void accept(ComputerVisitor visitor);
}
