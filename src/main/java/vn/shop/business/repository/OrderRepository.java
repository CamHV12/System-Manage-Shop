package vn.shop.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.shop.business.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}