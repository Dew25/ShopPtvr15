/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Melnikov
 */
public class CreateCustomer {

    public CreateCustomer() {
    }
    public boolean addCustomerToBase(String name, String surname, String code, Integer money){
        Customer customer = new Customer(name, surname, code, money);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShopPtvr15PU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }finally{
            if(em != null){
                em.close();
            }
            if(emf != null){
                emf.close();
            }
        }
        
        
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
