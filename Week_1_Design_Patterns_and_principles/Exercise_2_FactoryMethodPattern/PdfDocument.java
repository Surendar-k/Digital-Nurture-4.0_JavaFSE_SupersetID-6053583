package Exercise_2_FactoryMethodPattern;
//concrete class
public class PdfDocument implements Document {
     public void open(){
        System.out.println("Opening a PDF Document...");
    }
}
