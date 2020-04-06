package ru.iteco.superapp.httpservice.dao;

import ru.iteco.superapp.entity.Employee;
import ru.iteco.superapp.entity.Project;

import java.util.List;

public interface ProjectDAO {
    //create
    void add(Project project);

    //read
    List<Project> getAll();
    Project getById(Long id);

    //update
    void update(Project project);

    //delete
    void delete(Project project);
}
