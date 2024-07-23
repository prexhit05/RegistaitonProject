package com.oaklandsytems.employeeregistration.Repo;

import com.oaklandsytems.employeeregistration.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    public Employee findByLoginId(String loginId);
}
