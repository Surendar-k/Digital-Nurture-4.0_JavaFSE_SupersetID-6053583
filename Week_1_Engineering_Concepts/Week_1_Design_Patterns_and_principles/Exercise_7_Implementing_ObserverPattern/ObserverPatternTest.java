package Exercise_7_Implementing_ObserverPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("Alice");
        Observer mobile2 = new MobileApp("Bob");
        Observer web1 = new WebApp("Charlie");

        stockMarket.register(mobile1);
        stockMarket.register(mobile2);
        stockMarket.register(web1);

        System.out.println("\n--- Stock Price Update 1 ---");
        stockMarket.setStockData("AAPL", 182.25);

        System.out.println("\n--- Stock Price Update 2 ---");
        stockMarket.setStockData("GOOGL", 2741.30);

        System.out.println("\n--- Bob Unsubscribes ---");
        stockMarket.deregister(mobile2);

        System.out.println("\n--- Stock Price Update 3 ---");
        stockMarket.setStockData("TSLA", 695.50);
    }
}

