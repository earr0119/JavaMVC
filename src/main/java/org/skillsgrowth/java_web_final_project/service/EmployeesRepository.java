package org.skillsgrowth.java_web_final_project.service;

import org.skillsgrowth.java_web_final_project.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
}
