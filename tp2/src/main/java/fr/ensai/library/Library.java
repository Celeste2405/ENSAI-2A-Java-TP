package fr.ensai.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Attributes
    private String name;
    private List books ;

    // Constructor
    public Library(String name, List books) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}


