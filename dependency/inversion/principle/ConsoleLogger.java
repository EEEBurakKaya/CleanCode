package dependency.inversion.principle;

public class ConsoleLogger implements ILogger{
    public void log(){
        System.out.println("Console'a loglandı..");
    }
}
