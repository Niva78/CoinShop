/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Coin;

/**
 *
 * @author Jarvis
 */
public class CoinService {
    @PersistenceContext (unitName = "Homework1PU")
    protected EntityManager em;
    
    public CoinService(EntityManager em){
        this.em = em;
    }
    
    public Coin createClient(String coinName, double actualPrize, String description){
        Coin coin = new Coin(coinName, actualPrize, description);
        em.persist(coin);
        return coin;
    }
}
