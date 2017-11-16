/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public class CreateCustomer {

    public CreateCustomer() {
    }
    public List<Customer> doCreate(){
        List<Customer> customers = new ArrayList<>();
        
        Customer petrov = new Customer();
        petrov.setName("Петр");
        petrov.setSurname("Петров");
        petrov.setCode("3601134323");
        petrov.setMoney(1000);
        
        customers.add(petrov);
        
        Customer nickolajev = new Customer();
        nickolajev.setName("Николай");
        nickolajev.setSurname("Николаев");
        nickolajev.setCode("3651134323");
        nickolajev.setMoney(1000);
        
        customers.add(nickolajev);
        
        return customers;
    }
    
}
