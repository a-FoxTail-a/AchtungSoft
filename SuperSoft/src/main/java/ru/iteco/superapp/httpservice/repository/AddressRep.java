package ru.iteco.superapp.httpservice.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import ru.iteco.superapp.entity.Address;
import ru.iteco.superapp.httpservice.dao.AddressDAO;
import ru.iteco.superapp.util.SessionUtil;

import java.util.List;

public class AddressRep extends SessionUtil implements AddressDAO {
    @Override
    public void add(Address address) {
        openSessionAndTransaction();
        Session session = getSession();
        session.save(address);
        closeTransactionAndSession();
    }

    @Override
    public List<Address> getAll() {
        openSessionAndTransaction();
        String sql = "SELECT * FROM address";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Address.class);
        List<Address> addressList = query.list();
        closeTransactionAndSession();
        return addressList;
    }

    @Override
    public Address getById(Long id) {
        openSessionAndTransaction();
        String sql = "SELECT * FROM address WHERE id = :id";
        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Address.class);
        query.setParameter("id", id);
        Address address = (Address) query.getSingleResult();
        closeTransactionAndSession();
        return address;
    }

    @Override
    public void update(Address address) {
        openSessionAndTransaction();
        Session session = getSession();
        session.update(address);
        closeTransactionAndSession();
    }

    @Override
    public void delete(Address address) {
        openSessionAndTransaction();
        Session session = getSession();
        session.remove(address);
        closeTransactionAndSession();
    }
}
