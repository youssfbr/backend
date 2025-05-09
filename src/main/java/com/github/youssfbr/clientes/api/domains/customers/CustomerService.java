package com.github.youssfbr.clientes.api.domains.customers;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public void createCustomer(CreateCustomerDTO dto) {
        customerRepository.save(new Customer(dto));
    }

}
