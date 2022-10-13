/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Client;

/**
 *
 * @author Jarvis
 */
public class ClientService {
    
    @PersistenceContext (unitName = "Homework1PU")
    protected EntityManager em;
    
    public ClientService(EntityManager em){
        this.em = em;
    }
    
    public Client createClient(String name, String mail, String passwd, String phone){
        Client cli = new Client(name, mail, passwd, phone);
        em.persist(cli);
        return cli;
    }
}
