package segregation.principle;

public class Main {
    public static void main(String[] args) {
        IBook book = new EBook();
        book = new Book();

        EBook myEBook = (EBook) book;
        myEBook.parseToXml();
    }
}
