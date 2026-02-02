package com.devsuperior.exercicio_spring1.services;

import com.devsuperior.exercicio_spring1.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public Double total(Order order){
        return order.getBasic() - (order.getBasic() * order.getDiscount()/100) + shippingService.shipment(order);
    }
}
