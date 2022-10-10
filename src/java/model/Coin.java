/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jarvis
 */
@Entity
@Table(name = "COIN")
public class Coin {
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name = "COIN_ID")
    private int Id;

    private String coinName;
    private double actualPrize;
    private String description;
    
    //TODO add the keys to the purchase class
    
    public Coin(){
    }
    
    public Coin(String coinName, double actualPrize, String description){
        this.coinName = coinName;
        this.actualPrize = actualPrize;
        this.description = description;
    }
    
    public int getId() {
        return Id;
    }

    public String getCoinName() {
        return coinName;
    }

    public double getActualPrize() {
        return actualPrize;
    }

    public String getDescription() {
        return description;
    }
}
