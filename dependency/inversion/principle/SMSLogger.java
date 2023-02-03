package dependency.inversion.principle;

public class SMSLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("SMS loglandı.");
    }
}
