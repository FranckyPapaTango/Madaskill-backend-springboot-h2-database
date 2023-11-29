package com.h2.db.repository;


import com.h2.db.domain.Customer;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface CustomerRepositoryWithBagRelationships {
    Optional<Customer> fetchBagRelationships(Optional<Customer> customer);

    List<Customer> fetchBagRelationships(List<Customer> customers);

    Page<Customer> fetchBagRelationships(Page<Customer> customers);
}
