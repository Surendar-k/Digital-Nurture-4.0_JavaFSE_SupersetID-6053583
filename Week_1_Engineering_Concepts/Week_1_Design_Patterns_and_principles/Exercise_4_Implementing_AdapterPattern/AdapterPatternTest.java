package Exercise_4_Implementing_AdapterPattern;

public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());

        System.out.println("Using PayPal Adapter:");
        paypalProcessor.processPayment(100.0);

        System.out.println("Using Stripe Adapter:");
        stripeProcessor.processPayment(250.5);
    }
}
