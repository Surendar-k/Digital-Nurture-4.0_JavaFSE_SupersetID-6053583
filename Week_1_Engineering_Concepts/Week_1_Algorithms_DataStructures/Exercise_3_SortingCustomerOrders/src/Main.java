
import model.Order;
import sort.BubbleSort;
import sort.QuickSort;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 250.75),
                new Order(2, "Bob", 175.50),
                new Order(3, "Charlie", 340.00),
                new Order(4, "Diana", 220.25)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        
        BubbleSort.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        for (Order o : orders) System.out.println(o);

        orders = new Order[]{
                new Order(1, "Alice", 250.75),
                new Order(2, "Bob", 175.50),
                new Order(3, "Charlie", 340.00),
                new Order(4, "Diana", 220.25)
        };

        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        for (Order o : orders) System.out.println(o);
    }
}
