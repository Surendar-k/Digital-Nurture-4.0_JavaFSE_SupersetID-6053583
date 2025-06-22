import model.Product;
import search.SearchFunctions;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Shampoo", "Beauty"),
            new Product("P103", "Book", "Education"),
            new Product("P104", "Headphones", "Electronics"),
            new Product("P105", "Table", "Furniture")
        };

        String searchTerm = "Headphones";

      
        int linearIndex = SearchFunctions.linearSearch(products, searchTerm);
        System.out.println("\n Linear Search Result:");
        System.out.println(linearIndex != -1 ? products[linearIndex] : "Product not found");

      
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        int binaryIndex = SearchFunctions.binarySearch(products, searchTerm);
        System.out.println("\nBinary Search Result:");
        System.out.println(binaryIndex != -1 ? products[binaryIndex] : "Product not found");
    }
}
