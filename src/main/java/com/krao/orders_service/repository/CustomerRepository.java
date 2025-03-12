package com.krao.orders_service.repository;

import com.krao.orders_service.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    CustomerEntity findByName(String name);

    CustomerEntity findByEmail(String email);
}
