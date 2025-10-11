package vn.shop.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.shop.business.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}