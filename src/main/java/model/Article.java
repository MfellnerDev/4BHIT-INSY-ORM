package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * Article Model
 *
 * @author Manuel Fellner
 * @version 20.11.2023
 */
@Entity
@Table(name = "articles")
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private String description;
    private int price;
    private int amount;

    public Article() { }

    public Article(String description, int price, int amount) {
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
