package model.entities;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "CLIENT")
public class Client implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Comment_Gen")
    @Column(name = "CLIENT_ID")
    private int id;

    private String name;
    private String email;
    private String password;
    private String phone;

    @OneToMany
    private Collection<Purchase> purchases;

    public Client() {
        this.purchases = new ArrayList<>();
    }

    public Client(String name, String mail, String passwd, String phone) {
        this.name = name;
        this.email = mail;
        this.password = passwd;
        this.phone = phone;
        this.purchases = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public String getMail() {
        return this.email;
    }

    public String getPasswd() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void addPurchases(Purchase purchase) {
        this.purchases.add(purchase);
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + " Mail: " + this.email + " Password: " + this.password + " Phone:" + this.phone);
    }
}
