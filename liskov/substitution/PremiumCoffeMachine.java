package liskov.substitution;

public class PremiumCoffeMachine implements BaseCoffeMachine{

    private void brewLatte(){

    }
    private void brewCappucino(){

    }
    private void brewFilterCoffe(){

    }

    @Override
    public void brewCoffe(String coffeSelection) {
        System.out.println("Kahve seçimine göre kahve hazırlanıyor..");
        if(coffeSelection=="latte"){
            brewLatte();
        }else if (coffeSelection == "cappucino"){
            brewCappucino();
        }else{
            brewFilterCoffe();
        }
    }
}
