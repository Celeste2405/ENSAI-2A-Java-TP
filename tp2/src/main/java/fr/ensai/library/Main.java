package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);
        Library ensai= new Library("ensai_lib");
        Magazine elle = new Magazine("5256","Elle","5522",2024 , 16);
        ensai.add(elle);
        ensai.loadBooksFromCSV("books.csv");
        ensai.displayItems();


        System.out.println(fellowshipOfTheRing.toString());
    }
}