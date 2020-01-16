package com.bigstore.service.impl;

import com.bigstore.dataaccessobject.CustomerRepository;
import com.bigstore.domainobject.CustomerDO;
import com.bigstore.exception.ConstraintsViolationException;
import com.bigstore.exception.EntityNotFoundException;
import com.bigstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @author anil
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<CustomerDO> find(Long customerId) throws EntityNotFoundException {
        return Optional.empty();
    }

    @Override
    public CustomerDO create(CustomerDO customerDO) throws ConstraintsViolationException {
        return null;
    }

    @Override
    public void delete(Long CustomerId) throws EntityNotFoundException {

    }

    @Override
    public void update(CustomerDO customerDO) throws EntityNotFoundException {

    }

    @Override
    public CustomerDO findCustomerByEmail(String email) throws EntityNotFoundException {
        return null;
    }

    @Override
    public Iterable<CustomerDO> getAllCustomers() {
        return null;
    }
}
