package ru.iteco.superapp.httpservice.dao;

import ru.iteco.superapp.entity.Address;
import ru.iteco.superapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    //create
    void add(Employee employee);

    //read
    List<Employee> getAll();
    Employee getById(Long id);

    //update
    void update(Employee employee);

    //delete
    void delete(Employee employee);
}
