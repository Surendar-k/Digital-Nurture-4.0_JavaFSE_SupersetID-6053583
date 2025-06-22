package Exercise_8_Implementing_StrategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.makePayment(2500.00);

        
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(1500.00);
    }
}

