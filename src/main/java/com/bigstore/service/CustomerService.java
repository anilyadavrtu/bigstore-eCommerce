package com.bigstore.service;


import com.bigstore.domainobject.CustomerDO;
import com.bigstore.exception.ConstraintsViolationException;
import com.bigstore.exception.EntityNotFoundException;

import java.util.Optional;

/**
 * @author anil
 */
public interface CustomerService {
    /**
     * @param customerId
     * @return
     * @throws EntityNotFoundException
     */
    Optional<CustomerDO> find(Long customerId) throws EntityNotFoundException;

    /**
     * @param customerDO
     * @return
     * @throws com.bigstore.exception.ConstraintsViolationException
     */
    CustomerDO create(CustomerDO customerDO) throws ConstraintsViolationException;

    /**
     * @param CustomerId
     * @throws EntityNotFoundException
     */
    void delete(Long CustomerId) throws EntityNotFoundException;

    /**
     * @param customerDO
     * @throws EntityNotFoundException
     */
    void update(CustomerDO customerDO) throws EntityNotFoundException;

    /**
     * @param email
     * @return
     * @throws EntityNotFoundException
     */
    CustomerDO findCustomerByEmail(String email) throws EntityNotFoundException;

    /**
     * @return
     */
    Iterable<CustomerDO> getAllCustomers();
}
