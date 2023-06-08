package org.skillsgrowth.java_web_final_project;


import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Employees {
    private Integer id;
    private String Name;
    private String lastName;
    private String department;
    private String Phone;
    private int email;

    public Employees() {
    }


    public Employees(Integer id, String name, String lastName, String department, String phone, int email) {
        this.id = id;
        Name = name;
        this.lastName = lastName;
        this.department = department;
        Phone = phone;
        this.email = email;
    }

    public Employees(String name, String lastName, String department, String phone, int email) {
        Name = name;
        this.lastName = lastName;
        this.department = department;
        Phone = phone;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return Phone;
    }

    public int getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees employees)) return false;
        return email == employees.email && Objects.equals(id, employees.id) && Objects.equals(Name, employees.Name) && Objects.equals(lastName, employees.lastName) && Objects.equals(department, employees.department) && Objects.equals(Phone, employees.Phone);
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
                ", Phone='" + Phone + '\'' +
                ", email=" + email +
                '}';
    }
}
