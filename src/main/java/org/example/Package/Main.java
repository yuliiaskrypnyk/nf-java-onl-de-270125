package org.example.Package;

public class Main {
    public static void main(String[] args) {
/*        Book[] books = {
                new Book("Acb", "Author1", "123-456-789"),
                new Book("Cde", "Author2", "987-654-321"),
                new Book("Ght", "Author3", "111-222-333")
        };
        Library library = new Library(books);*/

        Library library = new Library(new Book[]{
                new Book("Acb", "Author1", "123-456-789"),
                new Book("Cde", "Author2", "987-654-321"),
                new Book("Ght", "Author3", "111-222-333")
        });

        System.out.println(library);

        library.addBook(new Book("Qwe", "Author4", "777-888-999"));

        System.out.println(library);

        library.deleteBook("Qwe");

        System.out.println(library);
    }
}
