package org.example.Package;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
        System.out.println("Book added: " + book);
    }

    public void deleteBook(String title) {
        int indexToRemove = -1;

        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Book[] newBooks = new Book[books.length - 1];
            for (int i = 0, j = 0; i < books.length; i++) {
                if (i != indexToRemove) {
                    newBooks[j++] = books[i];
                }
            }
            books = newBooks;
            System.out.println("Book " + title + " deleted");
        } else {
            System.out.println("Book " + title + " not found");
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
