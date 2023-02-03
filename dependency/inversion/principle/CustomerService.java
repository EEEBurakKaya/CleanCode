package dependency.inversion.principle;

import javax.xml.crypto.Data;
import java.io.Console;
import java.io.File;

public class CustomerService {

    private ILogger logger;

    public CustomerService(ILogger logger) {
        this.logger = logger;
    }

    void add(){
        // loglama
        logger.log();
        System.out.println("Customer eklendi..");
    }

    void update(){

    }
}
