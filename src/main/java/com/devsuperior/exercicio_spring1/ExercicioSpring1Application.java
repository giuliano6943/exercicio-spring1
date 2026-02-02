package com.devsuperior.exercicio_spring1;

import com.devsuperior.exercicio_spring1.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.devsuperior.exercicio_spring1.services.OrderService;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication

public class ExercicioSpring1Application implements CommandLineRunner {

    @Autowired
    OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(ExercicioSpring1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Locale.setDefault(Locale.US);

        System.out.println("Code: ");
        Integer code = sc.nextInt();
        System.out.println("Basic value: ");
        Double basic = sc.nextDouble();
        System.out.println("Discount: ");
        Double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.println("Code: " + order.getCode());
        System.out.println("Total value: " + orderService.total(order));
    }
}
