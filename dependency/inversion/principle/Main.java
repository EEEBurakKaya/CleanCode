package dependency.inversion.principle;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(new DatabaseLogger());
        customerService.add();


        CustomerService customerService1 = new CustomerService(new FileLogger());
        customerService1.add();


        CustomerService customerService2 = new CustomerService(new ConsoleLogger());
        customerService2.add();


        CustomerService customerService3 = new CustomerService(new SMSLogger());
        customerService3.add();

    }
}
