package com.github.youssfbr.clientes.api.controllers;

import com.github.youssfbr.clientes.api.domains.customers.CreateCustomerDTO;
import com.github.youssfbr.clientes.api.domains.customers.ICustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void create(@Valid @RequestBody CreateCustomerDTO dto) {
        customerService.createCustomer(dto);
    }
}
