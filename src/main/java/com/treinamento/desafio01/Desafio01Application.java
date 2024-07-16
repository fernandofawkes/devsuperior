package com.treinamento.desafio01;

import com.treinamento.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.treinamento.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
	@Autowired
	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String[] args)  throws Exception {
		Order order = new Order(1034, 95.90, 0.0);
		System.out.println(orderService.receipt(order));
	}

}
