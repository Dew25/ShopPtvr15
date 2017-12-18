/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr15;

<<<<<<< HEAD
import entity.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


=======
import classes.CreateCustomer;
import classes.CreateProduct;
<<<<<<< HEAD
import entity.Customer;
=======
import classes.Customer;
import classes.History;
>>>>>>> 8a6ce5a883beb2e541427bbccb08beeafc60d4ac
import entity.Product;
import classes.Purchase;
import java.util.List;
>>>>>>> 09bf7aaaac14b53b4bf62fd97a89226d6575419e

/**
 *
 * @author Melnikov
 */
public class ShopPtvr15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

<<<<<<< HEAD
        Product kolbasa = new Product();
        kolbasa.setName("Колбаса");
        kolbasa.setPrice(220);
        kolbasa.setQuantity(10);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShopPtvr15PU");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(kolbasa);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }finally{
            if(em != null){
                em.close();
            }
            if(emf != null){
                emf.close();
            }
        }
        
        
=======
        CreateProduct createProduct = new CreateProduct();
        //List<Product> products = createProduct.doCreate();
        
        
        CreateCustomer createCustomer = new CreateCustomer();
        //List<Customer> customers = createCustomer.doCreate();
        createCustomer.addCustomerToBase("Petr", "Petrov", "3895948555", 10000);

        //Здесь написать код, который берет из базы пользователя и продукт и совершает покупку.
        
        
        
//        for (int i = 0; i < products.size(); i++) {
//            Product product = products.get(i);
//            System.out.println("До покупки состояние объекта product: " + product.toString());
//        }
//        System.out.println("");
//        for (int i = 0; i < customers.size(); i++) {
//            Customer customer = customers.get(i);
//            System.out.println("До покупки состояние объекта customer: " + customer.toString());
//        }
//
//        System.out.println("");
//
//        Purchase purchase = new Purchase();
//        purchase.setCustomer(customers.get(0));
//        purchase.setProduct(products.get(0));
//        purchase.setQuantity(3);
//        purchase.doPurchase();
//        
//        purchase.setCustomer(customers.get(1));
//        purchase.setProduct(products.get(2));
//        purchase.setQuantity(4);
//        purchase.doPurchase();
//        
//        System.out.println("");
//        for (int i = 0; i < products.size(); i++) {
//            Product product = products.get(i);
//            System.out.println("После покупки состояние объекта product: " + product.toString());
//        }
//        
//        System.out.println("");
//        for (int i = 0; i < customers.size(); i++) {
//            Customer customer = customers.get(i);
//            System.out.println("После покупки состояние объекта customer: " + customer.toString());
//        }
>>>>>>> 09bf7aaaac14b53b4bf62fd97a89226d6575419e
    }

}
