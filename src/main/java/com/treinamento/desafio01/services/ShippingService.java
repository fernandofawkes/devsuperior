package com.treinamento.desafio01.services;

import com.treinamento.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public ShippingService() {
    }

    double shipment(Order order) {
        double amount = order.getBase();
        if(amount < 100.0) return 20.0;
        if(amount < 200.0) return 12.0;
        return 0.0;
    }
}
