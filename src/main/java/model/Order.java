package model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;
import jakarta.persistence.*;


/**
 * Order model
 *
 * @author Manuel Fellner
 * @version 20.11.2023
 */
@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="created_at")
    private Timestamp createdAt;

    @ManyToOne
    private Client client;

    @Column(name="order_lines")
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<OrderLine> orderLines;

    public Order() {
    }

    public Order(Timestamp createdAt, Client client, Set<OrderLine> orderLines) {
        this.createdAt = createdAt;
        this.client = client;
        this.orderLines = orderLines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
