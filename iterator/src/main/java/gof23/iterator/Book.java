package gof23.iterator;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private final String name;

    public Book(String name) {
        this.name = name;
    }
}
