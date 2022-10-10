/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
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
    @Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name = "CLIENT_ID")
    private int id;
    
    private String name;
    private String mail;
    private String passwd;
    private String phone;
    
    
    public Client(){
    }
    
    public Client(String name, String mail, String passwd, String phone){
        this.name = name;
        this.mail = mail;
        this.passwd = passwd;
        this.phone = phone;
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
    
    @Override
    public String toString(){
        return ("Name: " + this.name + " Mail: " + this.mail + " Password: " + this.passwd + " Phone:" + this.phone);
    }
}
