package com.example.visitor;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<ComputerComponent> components = new ArrayList<>();

    public void addComponent(ComputerComponent component) {
        components.add(component);
    }

    public void accept(ComputerVisitor visitor) {
        for (ComputerComponent component : components) {
            component.accept(visitor);
        }
    }
}
