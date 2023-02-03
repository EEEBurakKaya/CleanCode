package open.closed.principle;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,5));
        System.out.println(calculator.multiply(1,5));
        System.out.println(calculator.add(1,2,3,4,5,6,7));
    }
}
