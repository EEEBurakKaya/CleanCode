package segregation.principle;

public class EBook implements IBook,XmlParseable{
    @Override
    public void parseToXml() {
        System.out.println("XML'e parse edildi.");
    }
}
