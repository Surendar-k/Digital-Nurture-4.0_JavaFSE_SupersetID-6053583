

import model.Book;
import search.BookSearch;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "The Alchemist", "Paulo Coelho"),
                new Book(2, "To Kill a Mockingbird", "Harper Lee"),
                new Book(3, "1984", "George Orwell"),
                new Book(4, "Pride and Prejudice", "Jane Austen")
        };

        // Linear Search
        System.out.println(" Linear Search for '1984':");
        Book found = BookSearch.linearSearch(books, "1984");
        System.out.println(found != null ? found : " Book not found");

        // Binary Search
        System.out.println("\nSorting books for Binary Search...");
        BookSearch.sortBooksByTitle(books);

        System.out.println(" Binary Search for 'Pride and Prejudice':");
        Book foundBinary = BookSearch.binarySearch(books, "Pride and Prejudice");
        System.out.println(foundBinary != null ? foundBinary : " Book not found");
    }
}
