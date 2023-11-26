package model;

import java.io.Serializable;

import jakarta.persistence.*;

/**
 * OrderLine model
 *
 * @author Manuel Fellner
 * @version 20.11.2023
 */
@Entity
@Table(name = "order_lines")
public class OrderLine implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private int amount;

    public OrderLine() {
    }

    public OrderLine(Article article, Order order, int amount) {
        this.article = article;
        this.order = order;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
