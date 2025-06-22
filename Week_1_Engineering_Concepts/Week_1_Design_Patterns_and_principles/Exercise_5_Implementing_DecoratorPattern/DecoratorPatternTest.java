package Exercise_5_Implementing_DecoratorPattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);

        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);
        fullNotifier.send("Your order has been shipped!");
    }
}

