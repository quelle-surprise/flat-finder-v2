package com.quellesup.customerregistrationapi.dao.db;

import com.quellesup.customerregistrationapi.dto.dbmodel.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
