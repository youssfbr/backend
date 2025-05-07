package com.github.youssfbr.clientes.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @PostMapping
    public void cadastrar(@RequestBody String json) {
        System.out.println(json);
    }
}
