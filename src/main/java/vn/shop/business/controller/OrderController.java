package vn.shop.business.controller;

import vn.shop.business.entity.Order;
import vn.shop.business.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public String listOrders(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "order/list";
    }

    @GetMapping("/add")
    public String addOrderForm(Model model) {
        model.addAttribute("order", new Order());
        return "order/add";
    }

    @PostMapping("/add")
    public String addOrder(@ModelAttribute Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/edit/{id}")
    public String editOrderForm(@PathVariable Long id, Model model) {
        model.addAttribute("order", orderService.getOrder(id));
        return "order/edit";
    }

    @PostMapping("/edit")
    public String editOrder(@ModelAttribute Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }
}