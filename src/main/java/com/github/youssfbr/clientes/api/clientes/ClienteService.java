package com.github.youssfbr.clientes.api.clientes;

import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    private final IClienteRepository clienteRepository;

    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void cadastrar(DadosCadastroCliente dados) {
        clienteRepository.save(new Cliente(dados));
    }
}
