package com.github.youssfbr.clientes.api.controllers;

import com.github.youssfbr.clientes.api.domains.customers.CreateCustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @PostMapping
    public void create(@RequestBody CreateCustomerDTO dto) {
        System.out.println(dto);
    }
}
