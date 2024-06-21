package mk.finki.ukim.mk.lab.service.implementation;

import mk.finki.ukim.mk.lab.model.Order;
import mk.finki.ukim.mk.lab.repository.jpa.OrderRepository;
import mk.finki.ukim.mk.lab.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImplementation implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImplementation(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> placeOrder(String balloonColor, String balloonSize, String clientName, String address){
        return Optional.of(this.orderRepository.save(new Order(balloonColor, balloonSize)));
    }

    @Override
    public List<Order> listAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public void clearOrders() {
        this.orderRepository.deleteAll();
    }

    @Override
    public Optional<Order> save(String color, String size) {
        return Optional.of(this.orderRepository.save(new Order(color,size)));
    }

}
