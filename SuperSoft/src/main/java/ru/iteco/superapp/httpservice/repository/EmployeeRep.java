package ru.iteco.superapp.httpservice.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.iteco.superapp.entity.Employee;
import ru.iteco.superapp.httpservice.dao.EmployeeDAO;
import ru.iteco.superapp.util.SessionUtil;

import java.util.List;

public class EmployeeRep extends SessionUtil implements EmployeeDAO {
    @Override
    public void add(Employee employee) {
        openSessionAndTransaction();
        Session session = getSession();
        session.save(employee);
        closeTransactionAndSession();
    }

    @Override
    public List<Employee> getAll() {
        openSessionAndTransaction();
        Session session = getSession();
        String sql = "SELECT * FROM employees";
        Query query = session.createNativeQuery(sql).addEntity(Employee.class);
        List<Employee> employeeList = query.list();
        closeTransactionAndSession();
        return employeeList;
    }

    @Override
    public Employee getById(Long id) {
        openSessionAndTransaction();
        Session session = getSession();
        String sql = "SELECT * FROM employees WHERE id = :id";
        Query query = session.createNativeQuery(sql).addEntity(Employee.class);
        query.setParameter("id", id);
        Employee employee = (Employee) query.getSingleResult();
        closeTransactionAndSession();
        return employee;
    }

    @Override
    public void update(Employee employee) {
        openSessionAndTransaction();
        Session session = getSession();
        session.update(employee);
        closeTransactionAndSession();
    }

    @Override
    public void delete(Employee employee) {
        openSessionAndTransaction();
        Session session = getSession();
        session.delete(employee);
        closeTransactionAndSession();
    }
}
