/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

<<<<<<< HEAD
import entity.History;
import entity.Product;
import entity.Customer;
=======
import entity.Product;
>>>>>>> 8a6ce5a883beb2e541427bbccb08beeafc60d4ac
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author Melnikov
 */
public class Purchase {
    private Customer customer;
    private Product product;
    private Integer quantity;

    public Purchase() {
    }
    public void doPurchase(){
        History history = new History();
        history.setCustomer(customer);
        history.setProduct(product);
        history.setQuantity(quantity);
        Calendar c = new GregorianCalendar();
        history.setDatePurchase(c.getTime());
        product.setQuantity(product.getQuantity()-history.getQuantity());
        customer.setMoney(customer.getMoney()-history.getProduct().getPrice()*history.getQuantity());
        System.out.println(history.toString());
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" + "customer=" + customer.getName()+" "+customer.getSurname() + ", product=" + product.getName() + ", quantity=" + quantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.customer);
        hash = 13 * hash + Objects.hashCode(this.product);
        hash = 13 * hash + Objects.hashCode(this.quantity);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Purchase other = (Purchase) obj;
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }
    
    
}
