package model;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;

/**
 * Client model
 *
 * @author Manuel Fellner
 * @version 20.11.2023
 */
@Entity
@Table(name = "clients")
public class Client implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String city;
    private String country;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private Set<Order> orders;

    public Client() {
    }

    public Client(String name, String address, String city, String country, Set<Order> orders) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
