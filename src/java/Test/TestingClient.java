/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Client;
import Service.ClientService;

/**
 *
 * @author Jarvis
 */
public class TestingClient {
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OnlineRestaurantPU");
        
        EntityManager em = emf.createEntityManager();
        
        ClientService cliService = new ClientService(em);
        
        em.getTransaction().begin();
        Client cli1 =  cliService.createClient("Nicolas", "nicolas@gmail.com" , "1234", "5678");
        em.getTransaction().commit();
        System.out.println(cli1);
    }
    
}
