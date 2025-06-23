package search;

import model.Book;

import java.util.Arrays;
import java.util.Comparator;

public class BookSearch {

    
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

   
    public static Book binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;
        title = title.toLowerCase();

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareTo(title);

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    
    public static void sortBooksByTitle(Book[] books) {
        Arrays.sort(books, Comparator.comparing(b -> b.title));
    }
}
