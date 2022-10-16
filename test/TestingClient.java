import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.entities.Client;
import Service.ClientService;

/**
 *
 * @author Jarvis
 */
public class TestingClient {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework1PU");

        EntityManager em = emf.createEntityManager();

        ClientService cliService = new ClientService(em);

        em.getTransaction().begin();
        Client cli1 = cliService.createClient("Nicolas", "nicolas@gmail.com", "1234", "5678");
        em.getTransaction().commit();

        System.out.println(cli1);
    }

}
