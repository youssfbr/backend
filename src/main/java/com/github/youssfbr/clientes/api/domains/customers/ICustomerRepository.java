package com.github.youssfbr.clientes.api.domains.customers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer , Long> {
    Page<Customer> findAllPageByActiveTrue(Pageable pageable);
}
