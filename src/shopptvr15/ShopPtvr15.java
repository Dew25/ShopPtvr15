/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr15;

import entity.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 *
 * @author Melnikov
 */
public class ShopPtvr15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        
        
    }

}
