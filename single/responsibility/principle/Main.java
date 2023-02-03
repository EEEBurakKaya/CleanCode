package single.responsibility.principle;

public class Main {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        reader.readFile("log.txt");
    }
}
