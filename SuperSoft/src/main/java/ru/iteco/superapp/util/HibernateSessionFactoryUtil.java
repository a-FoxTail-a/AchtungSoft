package ru.iteco.superapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.iteco.superapp.entity.Address;
import ru.iteco.superapp.entity.Employee;
import ru.iteco.superapp.entity.Project;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactoryUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){

            try {
               return new Configuration().configure().buildSessionFactory();
            } catch (Throwable e) {
                System.out.println("Что-то пошло не так!" + e);
                throw new ExceptionInInitializerError(e);
            }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
