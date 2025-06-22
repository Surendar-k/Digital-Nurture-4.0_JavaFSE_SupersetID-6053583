package Exercise_5_Implementing_DecoratorPattern;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier){
        super(notifier);

    }
    @Override
    public void send(String message){
        super.send(message);
        System.out.println("Sending SMS: "+message);
    }
    
}

