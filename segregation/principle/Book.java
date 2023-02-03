package segregation.principle;

public class Book implements IBook,Printable{
    @Override
    public void print() {
        System.out.println("Kitap yazdırıldı.");
    }
}
