package com.example.library;

import java.util.ArrayList;

import java.util.List;

public class LibraryService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {

        books.add(book);

    }

    public List<Book> getAllBooks() {

        return new ArrayList<>(books);

    }

    public String lendBook(String title) {

        for (Book book : books) {

            if (book.getTitle().equals(title)) {

                if (!book.isAvailable()) {

                    return "Book already issued";

                } else {

                    book.lendBook();

                    return "Book issued successfully";

                }

            }

        }

        return "Book not found";

    }

}