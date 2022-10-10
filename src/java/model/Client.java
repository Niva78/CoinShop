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
public class Client implements Serializable {

    /**
     *
     */
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int age;
    private String name;
    private String phone;
    
    
    public Client(){
    }
    
    public Client(int age, String name, String phone){
        this.age=age;
        this.name = name;
        this.phone = phone;
    }
    
    public int getID(){
        return this.id;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    
    @Override
    public String toString(){
        return "Age: " + this.age + "Name: " + this.name + "Phone: " + this.phone;
    }
}
