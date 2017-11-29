/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Melnikov
 */
public class History {
    private Product product;
    private Customer customer;
    private Integer quantity;
    private Date datePurchase;

    public History() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    @Override
    public String toString() {
        return "History{" + "product=" + product.getName() + ", customer=" + customer.getName()+" "+customer.getSurname() + ", quantity=" + quantity + ", datePurchase=" + datePurchase.toString() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.product);
        hash = 59 * hash + Objects.hashCode(this.customer);
        hash = 59 * hash + Objects.hashCode(this.quantity);
        hash = 59 * hash + Objects.hashCode(this.datePurchase);
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
        final History other = (History) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.datePurchase, other.datePurchase)) {
            return false;
        }
        return true;
    }
    
    
}
