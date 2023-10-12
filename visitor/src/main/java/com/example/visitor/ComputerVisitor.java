package com.example.visitor;

public interface ComputerVisitor {
    void visit(CPU cpu);
    void visit(Memory memory);
    void visit(HardDisk hardDisk);
}
