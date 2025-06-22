package Exercise_2_FactoryMethodPattern;

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new ExcelDocument();
    }
}
