package com.github.youssfbr.clientes.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @PostMapping
    public void create(@RequestBody String json) {
        System.out.println(json);
    }
}
