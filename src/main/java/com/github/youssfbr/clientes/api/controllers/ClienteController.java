package com.github.youssfbr.clientes.api.controllers;

import com.github.youssfbr.clientes.api.clientes.DadosCadastroCliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        System.out.println(dados);
    }
}
