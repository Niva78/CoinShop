package Service;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entities.Purchase;

/**
 *
 * @author Jarvis
 */
public class PurchaseService {

    @PersistenceContext(unitName = "Homework1PU")
    protected EntityManager em;

    public PurchaseService(EntityManager em) {
        this.em = em;
    }

    public Purchase createClient(double pricePerCoin, float coinAmount, Date date) {
        Purchase purchase = new Purchase(pricePerCoin, coinAmount, date);
        em.persist(purchase);
        return purchase;
    }
}
