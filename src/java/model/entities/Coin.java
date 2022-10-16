package model.entities;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COIN")
public class Coin implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Comment_Gen")
    @Column(name = "COIN_ID")
    private int Id;

    private String coinName;
    private double actualPrice;
    private String description;

    @OneToMany
    public Collection<Purchase> purchases;

    public Coin() {
        this.purchases = new ArrayList<>();
    }

    public Coin(String coinName, double actualPrize, String description) {
        this.coinName = coinName;
        this.actualPrice = actualPrize;
        this.description = description;
        this.purchases = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public String getCoinName() {
        return coinName;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public String getDescription() {
        return description;
    }

    public void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }
}
