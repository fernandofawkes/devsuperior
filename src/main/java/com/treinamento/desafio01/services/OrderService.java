package com.treinamento.desafio01.services;

import com.treinamento.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return this.shippingService.shipment(order) + (order.getBase() * (100 - order.getDiscount())/100);
    }

    public String receipt(Order order) {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Pedido código: ").append(order.getCode()).append(System.lineSeparator())
                .append("Valor total: R$").append(this.total(order));

        return sb.toString();
    }
}
