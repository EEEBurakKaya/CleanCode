package com.etiya.customer.management.services.concretes;

import com.etiya.customer.management.core.ccc.logging.ILogger;
import com.etiya.customer.management.entities.concretes.Customer;
import com.etiya.customer.management.repositories.abstracts.ICustomerRepository;
import com.etiya.customer.management.repositories.concretes.InMemoryCustomerRepository;
import com.etiya.customer.management.services.abstracts.ICustomerCheckService;
import com.etiya.customer.management.services.abstracts.ICustomerService;
import com.etiya.mernis.MernisApplication;

import java.util.List;

public class CustomerService implements ICustomerService {

    private ICustomerRepository customerRepository;
    private ILogger logger;
    private ICustomerCheckService customerCheckService;

    public CustomerService(ICustomerRepository customerRepository,ILogger logger,ICustomerCheckService customerCheckService)
    {
            this.customerRepository = customerRepository;
            this.logger = logger;
            this.customerCheckService = customerCheckService;
    }

    @Override
    public List<Customer> getAll() {
        // kullanıcı giriş yapmış mı?
        isUserAuthenticated();
        // veri erişimden veriyi iste..
        // if suistimali
        logger.log("CustomerService.GetAll()");
        return customerRepository.getAll();
    }


    /**
     * Bu fonksiyon eklenmek istenen customer bilgilerini alarak validasyon ve iş kuralları
     * uyguladıktan sonra customeri ekler.
     * @param customer eklemek istediğimiz customerin bilgilerini tutan alan.
     * @throws Exception eğer validasyon veya iş kuralı hatası alınırsa exception fırlatılmaktadır.
     */
    @Override
    public void add(Customer customer) throws Exception {
        validateCustomer(customer);
        checkIfCustomerExistsWithSameNationalityId(customer.getNationalityId());
        checkIfNationalityIdValid(customer.getName(),customer.getLastName(),customer.getNationalityId());
        customerRepository.add(customer);
    }

    @Override
    public void update(Customer customer) throws Exception {
        checkIfCustomerExistsWithSameNationalityId(customer.getNationalityId());
    }

    @Override
    public void delete(Customer customer) throws Exception {
        customerRepository.delete(customer);
    }

    @Override
    public Customer getById(int id) {
        return customerRepository.getById(id);
    }


    private void validateCustomer(Customer customer) throws Exception {
        validateCustomerNationalityId(customer.getNationalityId());
        // validasyon => java.validation
        // @NotNull
    }

    /**
     * Lorem ipsum...
     * @param nationalityId valide edilecek TCKN.
     * @throws Exception validasyon hatalı ise fırlatılacak exception.
     */
    private void validateCustomerNationalityId(String nationalityId) throws Exception {
        if(nationalityId.length() != 11)
            throw new Exception("TC Kimlik 11 hane olmalıdır.");
    }
    private void checkIfCustomerExistsWithSameNationalityId(String nationalityId) throws Exception {
        /*if(this.customerRepository.getAll()
                .stream().filter(i->i.getCustomerNo().equals(nationalityId)) != null){
            throw new Exception("Bu tckn ile bir müşteri mevcut.");
        }*/
    }
    private void isUserAuthenticated(){
        System.out.println("Kullanıcı giriş yapmış durumda..");
    }
    private void checkIfNationalityIdValid(String name, String lastName, String nationalityId) throws Exception {
        // loose coupling
       boolean result = customerCheckService.validateNationalityIdentity(name,lastName,nationalityId);
       if(!result)
            throw new Exception("TCKN doğrulanamadı..");
    }
    public void checkCustomerWithId (int id ) throws Exception {
        Customer customer = customerRepository.getById(id);
        if (customer == null ){
            throw new Exception("Böyle bir müşteri yok!");
        }
    }
}
