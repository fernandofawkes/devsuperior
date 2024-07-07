package com.treinamento.desafio01.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
    private int code;
    private double base;
    private double discount;

    public Order(int code, double base, double discount) {
        this.code = code;
        this.base = base;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
