package Exercise_2_FactoryMethodPattern;
//concrete class
public class ExcelDocument implements Document{
    public void open(){
        System.out.println("Opening an Excel Document...");
    }
    
}
