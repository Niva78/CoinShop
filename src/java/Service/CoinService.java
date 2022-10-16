package Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entities.Coin;

/**
 *
 * @author Jarvis
 */
public class CoinService {

    @PersistenceContext(unitName = "Homework1PU")
    protected EntityManager em;

    public CoinService(EntityManager em) {
        this.em = em;
    }

    public Coin createClient(String coinName, double actualPrize, String description) {
        Coin coin = new Coin(coinName, actualPrize, description);
        em.persist(coin);
        return coin;
    }
}
