package com.adm.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<com.adm.demo.entity.Employee, Long>{
}
