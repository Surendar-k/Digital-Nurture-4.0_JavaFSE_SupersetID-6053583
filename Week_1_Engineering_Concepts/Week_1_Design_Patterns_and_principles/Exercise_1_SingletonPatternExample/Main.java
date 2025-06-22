package Exercise_1_SingletonPatternExample;
public class Main {
    public static void main(String[] args){
        Logger logger1= Logger.getInstance();
        logger1.log("Starting the application....");

        Logger logger2=Logger.getInstance();
        logger2.log("Application is Running...");

        if(logger1==logger2){
            System.out.println("Only one logger instance exists");

        }
        else{
            System.out.println("Different logger instance exists");
        }
    }

}
