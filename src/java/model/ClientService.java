/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.EntityManager;

/**
 *
 * @author Jarvis
 */
public class ClientService {
    protected EntityManager em;
    
    public ClientService(EntityManager em){
        this.em = em;
    }
    
    public Client createClient(int age, String name, String phone){
        Client cli = new Client(age, name, phone);
        em.persist(cli);
        
        return cli;
    }
}
