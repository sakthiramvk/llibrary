package com.example.library;

public class Book {

    private int id;

    private String title;

    private boolean availability;

    public Book(int id, String title) {

        this.id = id;

        this.title = title;

        this.availability = true;

    }

    public int getId() {

        return id;

    }

    public String getTitle() {

        return title;

    }

    public boolean isAvailable() {

        return availability;

    }

    public void lendBook() {

        if (availability) {

            availability = false;

        }

    }

    public void returnBook() {

        availability = true;

    }

    @Override

    public String toString() {

        return "Book{" +

                "id=" + id +

                ", title='" + title + '\'' +

                ", availability=" + availability +

                '}';

    }

}