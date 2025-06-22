package Exercise_4_Implementing_AdapterPattern;

public class PayPalGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Paid $" + amountInDollars + " using PayPal.");
    }
    
}
