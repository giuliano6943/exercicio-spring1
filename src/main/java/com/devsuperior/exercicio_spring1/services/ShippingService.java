package com.devsuperior.exercicio_spring1.services;

import com.devsuperior.exercicio_spring1.model.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {

        if (order.getBasic() < 100) {
            return 20.00;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}

