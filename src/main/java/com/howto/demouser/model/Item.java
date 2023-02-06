package com.howto.demouser.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer id;

    @ManyToMany()
    @JoinTable(
            name = "items_orders",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id")
    )
    Set<Order> linkedOrders;


    private String productName;

    private Integer taxTypeId;

    private Double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getTaxTypeId() {
        return taxTypeId;
    }

    public void setTaxTypeId(Integer taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Order> getLinkedOrders() {
        return linkedOrders;
    }

    public void setLinkedOrders(Set<Order> linkedOrders) {
        this.linkedOrders = linkedOrders;
    }
}
