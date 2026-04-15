package com.example.library;

public class Main {

    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        // Add books

        Book book1 = new Book(1, "1984");

        Book book2 = new Book(2, "To Kill a Mockingbird");

        Book book3 = new Book(3, "The Great Gatsby");

        library.addBook(book1);

        library.addBook(book2);

        library.addBook(book3);

        // List all books

        System.out.println("All books in library:");

        library.getAllBooks().forEach(System.out::println);

        // Try lending

        System.out.println("\nLending '1984': " + library.lendBook("1984"));

        System.out.println("Lending '1984' again: " + library.lendBook("1984"));

        System.out.println("Lending 'Nonexistent Book': " + library.lendBook("Nonexistent Book"));

        // List again

        System.out.println("\nBooks after lending:");

        library.getAllBooks().forEach(System.out::println);

    }

}