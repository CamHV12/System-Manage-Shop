package vn.shop.business.service;

import vn.shop.business.entity.Employee;
import vn.shop.business.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() { return employeeRepository.findAll(); }
    public Employee getEmployee(Long id) { return employeeRepository.findById(id).orElse(null); }
    public Employee saveEmployee(Employee employee) { return employeeRepository.save(employee); }
    public void deleteEmployee(Long id) { employeeRepository.deleteById(id); }
}