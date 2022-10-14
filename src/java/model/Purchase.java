/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jarvis
 */


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table(name = "PURCHASE")
public class Purchase implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Comment_Gen") 
    @Column(name = "PURCHASE_ID")
    public int Id;
    
    private double pricePerCoin;
    private float coinAmount;
    private Date date;
    
    //TODO Still have to implement the foreing keys to client and coin.
    
    @OneToMany(mappedBy="purchaces")
    private Client client;
    
    @OneToMany(mappedBy="purchaces")
    private Coin coin;
    
    public Purchase(){
        
    }
    
    public Purchase(double pricePerCoin, float coinAmount, Date date){
        this.pricePerCoin = pricePerCoin;
        this.coinAmount = coinAmount;
        this.date = (Date)date.clone();
    }

    public float getCoinAmount() {
        return coinAmount;
    }

    public Date getDate() {
        return date;
    }

    public double getPricePerCoin() {
        return pricePerCoin;
    }
    
    public void setClient(Client client) {
        if (this.client == null){
            this.client = client;
        }
    }
    
    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        if(this.coin == null){
            this.coin = coin;
        }
    }
}
