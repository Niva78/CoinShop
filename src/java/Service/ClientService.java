package Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.entities.Client;

/**
 *
 * @author Jarvis
 */
public class ClientService {

    @PersistenceContext(unitName = "Homework1PU")
    protected EntityManager em;

    public ClientService(EntityManager em) {
        this.em = em;
    }

    public Client createClient(String name, String mail, String passwd, String phone) {
        Client cli = new Client(name, mail, passwd, phone);
        em.persist(cli);
        return cli;
    }
}
