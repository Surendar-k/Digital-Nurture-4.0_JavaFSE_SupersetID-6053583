package Exercise_2_FactoryMethodPattern;
//concrete Factories
public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new WordDocument();
    }

    
}
