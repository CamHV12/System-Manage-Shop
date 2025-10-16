package vn.shop.business.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.shop.business.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}