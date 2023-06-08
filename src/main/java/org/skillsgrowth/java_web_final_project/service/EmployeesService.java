package org.skillsgrowth.java_web_final_project.service;

import org.skillsgrowth.java_web_final_project.model.Employees;
import org.skillsgrowth.java_web_final_project.model.EmployeesDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeesService {

    private EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {

        this.employeesRepository = employeesRepository;
    }

    public List<Employees> getAllEmployees(){

        return employeesRepository.findAll();
    }

    public Employees getEmployeeById(Integer id) {
        Optional<Employees> employeeOptional = employeesRepository.findById(id);
        return employeeOptional.orElseThrow(null);
    }

    public void addEmployee(EmployeesDTO newEmployee){
        Employees newEmployeeToAdd = new Employees();

        newEmployeeToAdd.setName(newEmployee.name());
        newEmployeeToAdd.setLastName(newEmployee.lastName());
        newEmployeeToAdd.setDepartment(newEmployee.department());
        newEmployeeToAdd.setPhone(newEmployeeToAdd.getPhone());
        newEmployeeToAdd.setEmail(newEmployee.email());

        employeesRepository.save(newEmployeeToAdd);
    }

    public void putEmployee(Employees putEmployee){
        Integer id = putEmployee.getId();
        Employees foundEmployee = employeesRepository.findById(id).orElseThrow();
        foundEmployee.setName(putEmployee.getName());
        foundEmployee.setLastName(putEmployee.getLastName());
        foundEmployee.setDepartment(putEmployee.getDepartment());
        foundEmployee.setPhone(putEmployee.getPhone());
        foundEmployee.setEmail(putEmployee.getEmail());
        employeesRepository.save(foundEmployee);
    }

    public void deleteEmployee(Integer id) {
        employeesRepository.deleteById(id);
    }


    public void putEmployee(EmployeesDTO employee, Integer id) {
        Employees foundEmployee = employeesRepository.findById(id).orElseThrow();
        foundEmployee.setName(employee.name());
        foundEmployee.setLastName(employee.lastName());
        foundEmployee.setDepartment(employee.department());
        foundEmployee.setPhone((long) employee.phone());
        foundEmployee.setEmail(employee.email());
        employeesRepository.save(foundEmployee);
    }

}
