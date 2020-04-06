package ru.iteco.superapp.util;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SessionUtil {
    private Session session;
    private Transaction transaction;

    public Session getSession() {
        return session;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public Session openSession() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }
    public Session openSessionAndTransaction() {
        session = openSession();
        transaction = session.beginTransaction();
        return session;
    }
    public void closeSession() {
        session.close();
    }
    public void closeTransactionAndSession() {
        transaction.commit();
        closeSession();
    }
}
