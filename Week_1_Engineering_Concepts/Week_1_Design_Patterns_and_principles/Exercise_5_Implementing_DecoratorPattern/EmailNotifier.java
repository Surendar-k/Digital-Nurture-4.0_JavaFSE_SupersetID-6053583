package Exercise_5_Implementing_DecoratorPattern;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message){
        System.out.println("Sending Email: "+ message);
    }
    
}
