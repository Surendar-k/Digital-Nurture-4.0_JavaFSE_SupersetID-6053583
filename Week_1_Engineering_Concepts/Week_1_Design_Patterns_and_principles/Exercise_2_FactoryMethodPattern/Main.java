package Exercise_2_FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory PdfFactory = new PdfDocumentFactory();
        Document pdf = PdfFactory.createDocument();
        pdf.open();

        DocumentFactory ExcelFactory = new ExcelDocumentFactory();
        Document excel = ExcelFactory.createDocument();
        excel.open();
    }
    
}
