package Exercise_8_Implementing_StrategyPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void makePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy selected!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

