package com.bigstore.dataaccessobject;

import com.bigstore.domainobject.CustomerDO;
import org.springframework.data.repository.CrudRepository;

/**
 * @author anil
 */
public interface CustomerRepository extends CrudRepository<CustomerDO,Long> {

}
