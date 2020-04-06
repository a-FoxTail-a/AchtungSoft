package ru.iteco.superapp.httpservice.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.iteco.superapp.entity.Project;
import ru.iteco.superapp.httpservice.dao.ProjectDAO;
import ru.iteco.superapp.util.SessionUtil;

import java.util.List;

public class ProjectRep extends SessionUtil implements ProjectDAO {
    @Override
    public void add(Project project) {
        openSessionAndTransaction();
        Session session = getSession();
        session.save(project);
        closeTransactionAndSession();
    }

    @Override
    public List<Project> getAll() {
        openSessionAndTransaction();
        Session session = getSession();
        String sql = "SELECT * FROM projects";
        Query query = session.createNativeQuery(sql).addEntity(Project.class);
        List<Project> projectList = query.list();
        closeTransactionAndSession();
        return projectList;
    }

    @Override
    public Project getById(Long id) {
        openSessionAndTransaction();
        Session session = getSession();
        String sql = "SELECT * FROM projects WHERE id = :id";
        Query query = session.createNativeQuery(sql).addEntity(Project.class);
        query.setParameter("id", id);
        Project project = (Project) query.getSingleResult();
        closeTransactionAndSession();
        return project;
    }

    @Override
    public void update(Project project) {
        openSessionAndTransaction();
        Session session = getSession();
        session.update(project);
        closeTransactionAndSession();
    }

    @Override
    public void delete(Project project) {
        openSessionAndTransaction();
        Session session = getSession();
        session.delete(project);
        closeTransactionAndSession();
    }
}
