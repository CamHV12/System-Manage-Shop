package vn.shop.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.shop.business.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}