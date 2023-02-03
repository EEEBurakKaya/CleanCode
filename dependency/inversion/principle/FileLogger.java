package dependency.inversion.principle;

public class FileLogger implements  ILogger{
    public void log(){
        System.out.println("File'a loglandı..");
    }
}
