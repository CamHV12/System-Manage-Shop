package vn.shop.business.service;

import vn.shop.business.entity.Order;
import vn.shop.business.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() { return orderRepository.findAll(); }
    public Order getOrder(Long id) { return orderRepository.findById(id).orElse(null); }
    public Order saveOrder(Order order) { return orderRepository.save(order); }
    public void deleteOrder(Long id) { orderRepository.deleteById(id); }
}