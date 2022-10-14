/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author Jarvis
 */

@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {

    /**
     *
     */ 
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Comment_Gen")
    @Column(name = "CLIENT_ID")
    private int id;
    
    private String name;
    private String mail;
    private String passwd;
    private String phone;
    
    @OneToMany
    private Collection<Purchase> purchaces;
    
    
    public Client(){
        this.purchaces = new ArrayList<Purchase>();
    }
    
    public Client(String name, String mail, String passwd, String phone){
        this.name = name;
        this.mail = mail;
        this.passwd = passwd;
        this.phone = phone;
        this.purchaces = new ArrayList<Purchase>();
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public String getPasswd(){
        return this.passwd;
    }
    
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    
    
    public void addPurchaces(Purchase purchace) {
        this.purchaces.add(purchace);
    }
    
    @Override
    public String toString(){
        return ("Name: " + this.name + " Mail: " + this.mail + " Password: " + this.passwd + " Phone:" + this.phone);
    }
}
