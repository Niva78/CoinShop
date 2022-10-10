/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Purchase;

/**
 *
 * @author Jarvis
 */
public class PurchaseService {
        @PersistenceContext (unitName = "OnlineRestaurantPU")
    protected EntityManager em;
    
    public PurchaseService(EntityManager em){
        this.em = em;
    }
    
    public Purchase createClient(double pricePerCoin, float coinAmount, Date date){
        Purchase purchase = new Purchase(pricePerCoin, coinAmount, date);
        em.persist(purchase);
        return purchase;
    }
}
