package com.example.visitor;

public class ComputerInfoVisitor implements ComputerVisitor {
    @Override
    public void visit(CPU cpu) {
        System.out.println("CPU信息: " + cpu.getInfo());
    }

    @Override
    public void visit(Memory memory) {
        System.out.println("内存信息: " + memory.getInfo());
    }

    @Override
    public void visit(HardDisk hardDisk) {
        System.out.println("硬盘信息: " + hardDisk.getInfo());
    }
}
