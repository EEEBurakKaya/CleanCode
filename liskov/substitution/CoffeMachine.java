package liskov.substitution;

public class CoffeMachine implements BaseCoffeMachine{
    @Override
    public void brewCoffe(String coffeSelection) {
        System.out.println("Filter coffe brewed");
    }
}
