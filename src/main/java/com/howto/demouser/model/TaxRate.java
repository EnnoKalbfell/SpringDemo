package com.howto.demouser.model;

import jakarta.persistence.*;

@Entity
@Table(name = "taxClass")
public class TaxRate {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Double percentage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
