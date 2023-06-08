package org.skillsgrowth.java_web_final_project.controller;

import org.skillsgrowth.java_web_final_project.model.Employees;
import org.skillsgrowth.java_web_final_project.model.EmployeesDTO;
import org.skillsgrowth.java_web_final_project.service.EmployeesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class EmployeesController {
    private final EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/employees1")
    public List<Employees> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employees getEmployeeById(@PathVariable Integer id) {
        return employeesService.getEmployeeById(id);
    }

    @PostMapping("/employees1")
    public void addEmployee(@RequestBody EmployeesDTO newEmployee) {
        employeesService.addEmployee(newEmployee);
    }

    @PutMapping("/employees/{id}")
    public void putEmployee(@RequestBody Employees employee) {
        employeesService.putEmployee(employee);
    }

    @PutMapping("/employees/update/{id}")
    public void putEmployee(@RequestBody EmployeesDTO employee, @PathVariable Integer id){
        employeesService.putEmployee(employee, id);
    }
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeesService.deleteEmployee(id);
    }


}
