/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr15;

import classes.CreateCustomer;
import classes.CreateProduct;
import classes.Customer;
import classes.History;
import classes.Product;
import classes.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public class ShopPtvr15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CreateProduct createProduct = new CreateProduct();
        List<Product> products = createProduct.doCreate();
        
        CreateCustomer createCustomer = new CreateCustomer();
        List<Customer> customers = createCustomer.doCreate();

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("До покупки состояние объекта product: " + product.toString());
        }
        System.out.println("");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("До покупки состояние объекта customer: " + customer.toString());
        }

        System.out.println("");

        Purchase purchase = new Purchase();
        purchase.setCustomer(customers.get(0));
        purchase.setProduct(products.get(0));
        purchase.setQuantity(3);
        purchase.doPurchase();
        
        purchase.setCustomer(customers.get(1));
        purchase.setProduct(products.get(2));
        purchase.setQuantity(4);
        purchase.doPurchase();
        
        System.out.println("");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("После покупки состояние объекта product: " + product.toString());
        }
        
        System.out.println("");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("После покупки состояние объекта customer: " + customer.toString());
        }
    }

}