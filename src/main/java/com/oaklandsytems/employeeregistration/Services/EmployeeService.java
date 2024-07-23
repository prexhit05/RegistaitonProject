package com.oaklandsytems.employeeregistration.Services;

import com.oaklandsytems.employeeregistration.Entities.Employee;
import com.oaklandsytems.employeeregistration.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public void postEmp(Employee emp) {
        employeeRepo.save(emp);
    }

    public boolean login(String loginId, String password) {
        for (Employee employee : employeeRepo.findAll()) {
            if (employee.getLoginId().equals(loginId)) {
                if (employee.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Employee getemp(String loginId) {
        Employee employee1 = null;
        for (Employee employee : employeeRepo.findAll()) {
            if (employee.getLoginId().equals(loginId)) {
                employee1 = employee;
                return employee1;
            }
        }return employee1;
    }

    public List<Employee> getAllEmp(){
        return employeeRepo.findAll();
    }
}
