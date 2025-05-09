package com.github.youssfbr.clientes.api.controllers;

import com.github.youssfbr.clientes.api.domains.clientes.DadosCadastroCliente;
import com.github.youssfbr.clientes.api.domains.clientes.IClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final IClienteService clienteService;

    public ClienteController(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        clienteService.cadastrar(dados);
    }
}
