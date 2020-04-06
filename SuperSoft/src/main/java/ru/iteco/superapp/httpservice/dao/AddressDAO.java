package ru.iteco.superapp.httpservice.dao;

import ru.iteco.superapp.entity.Address;

import java.util.List;

public interface AddressDAO {
    //create
    void add(Address address);

    //read
    List<Address> getAll();
    Address getById(Long id);

    //update
    void update(Address address);

    //delete
    void delete(Address address);
}
