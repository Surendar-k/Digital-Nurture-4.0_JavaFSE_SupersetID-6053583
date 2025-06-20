package Exercise_4_Implementing_AdapterPattern;

public class StripeGateway {
    public void sendPayment(double amount) {
        System.out.println("Paid $" + amount + " using Stripe.");
    }
}
