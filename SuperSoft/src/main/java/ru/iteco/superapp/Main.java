package ru.iteco.superapp;

import ru.iteco.superapp.entity.Employee;
import ru.iteco.superapp.httpservice.repository.EmployeeRep;

public class Main {
    public static void main(String[] args) {
        EmployeeRep employeeRep = new EmployeeRep();
        Employee employee = new Employee();
        employee.setFirstName("jhhg");
        employee.setLastName("edckeh");
        employee.setMiddleName("efjbkjcbkejrc");
        employee.setPhone("213546");
        employee.setEmail("123@ya.ru");
        employeeRep.add(employee);
    }
}
