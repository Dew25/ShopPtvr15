/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;
<<<<<<< HEAD
import javax.persistence.Basic;
import javax.persistence.Column;
=======
<<<<<<< HEAD:src/entity/Product.java
import javax.persistence.Basic;
import javax.persistence.Column;
=======
>>>>>>> 8a6ce5a883beb2e541427bbccb08beeafc60d4ac:src/entity/Product.java
>>>>>>> 09bf7aaaac14b53b4bf62fd97a89226d6575419e
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.Table;
=======
<<<<<<< HEAD:src/entity/Product.java
import javax.persistence.Table;
=======
>>>>>>> 8a6ce5a883beb2e541427bbccb08beeafc60d4ac:src/entity/Product.java
>>>>>>> 09bf7aaaac14b53b4bf62fd97a89226d6575419e

/**
 *
 * @author Melnikov
 */
@Entity
<<<<<<< HEAD
@Table(name = "product")
=======
<<<<<<< HEAD:src/entity/Product.java
@Table(name = "product")
=======
>>>>>>> 8a6ce5a883beb2e541427bbccb08beeafc60d4ac:src/entity/Product.java
>>>>>>> 09bf7aaaac14b53b4bf62fd97a89226d6575419e
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< HEAD
    @Basic(optional = false)
    @Column(unique = true)
    private String name;
    @Basic(optional = false)
    private Integer price;
=======
<<<<<<< HEAD:src/entity/Product.java
    
    @Basic(optional = false)
    @Column(unique = true)
=======
>>>>>>> 8a6ce5a883beb2e541427bbccb08beeafc60d4ac:src/entity/Product.java
    private String name;
    
    @Basic(optional = false)
    private Integer price;
    
>>>>>>> 09bf7aaaac14b53b4bf62fd97a89226d6575419e
    @Basic(optional = false)
    private Integer quantity;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.price);
        hash = 67 * hash + Objects.hashCode(this.quantity);
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }

    
    
    
}
