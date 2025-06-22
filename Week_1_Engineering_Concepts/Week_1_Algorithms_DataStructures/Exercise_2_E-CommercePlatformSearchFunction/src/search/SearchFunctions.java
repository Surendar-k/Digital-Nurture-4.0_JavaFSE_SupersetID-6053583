package search;

import model.Product;

public class SearchFunctions {

    
    public static int linearSearch(Product[] products, String key) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

   
    public static int binarySearch(Product[] products, String key) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].getProductName().compareToIgnoreCase(key);

            if (comparison == 0)
                return mid;
            else if (comparison < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
