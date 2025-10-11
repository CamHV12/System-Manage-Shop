package vn.shop.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.shop.business.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}