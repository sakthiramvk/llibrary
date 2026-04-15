package com.example.library;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class LibraryServiceTest {

    private LibraryService library;

    @BeforeEach

    void setUp() {

        library = new LibraryService();

        Book book1 = new Book(1, "1984");

        Book book2 = new Book(2, "To Kill a Mockingbird");

        library.addBook(book1);

        library.addBook(book2);

    }

    @Test

    void testAddBook() {

        Book book = new Book(3, "Test Book");

        library.addBook(book);

        List<Book> books = library.getAllBooks();

        assertEquals(3, books.size());

        assertTrue(books.contains(book));

    }

    @Test

    void testLendBookSuccess() {

        String result = library.lendBook("1984");

        assertEquals("Book issued successfully", result);

        // Check availability

        Book book = library.getAllBooks().stream().filter(b -> b.getTitle().equals("1984")).findFirst().orElse(null);

        assertNotNull(book);

        assertFalse(book.isAvailable());

    }

    @Test

    void testLendBookAlreadyIssued() {

        library.lendBook("1984"); // First lend

        String result = library.lendBook("1984"); // Second attempt

        assertEquals("Book already issued", result);

    }

    @Test

    void testLendBookNotFound() {

        String result = library.lendBook("Nonexistent Book");

        assertEquals("Book not found", result);

    }

}