package org.skillsgrowth.java_web_final_project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employees {
    @Id
    @GeneratedValue
    private Integer id;
    private String Name;
    private String lastName;
    private String department;
    private Long Phone;
    private String email;

    public Employees() {
    }

    public Employees(String name,
                     String lastName,
                     String department,
                     Long phone,
                     String email) {
        Name = name;
        this.lastName = lastName;
        this.department = department;
        Phone = phone;
        this.email = email;
    }

    public Employees(Integer id,
                     String name,
                     String lastName,
                     String department,
                     Long phone,
                     String email) {
        this.id = id;
        Name = name;
        this.lastName = lastName;
        this.department = department;
        Phone = phone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees employees)) return false;
        return Phone == employees.Phone && Objects.equals(id, employees.id) && Objects.equals(Name, employees.Name) && Objects.equals(lastName, employees.lastName) && Objects.equals(department, employees.department) && Objects.equals(email, employees.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, lastName, department, Phone, email);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", Phone=" + Phone +
                ", email='" + email + '\'' +
                '}';
    }

}
