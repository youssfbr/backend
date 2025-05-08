package com.github.youssfbr.clientes.api.clientes;

import com.github.youssfbr.clientes.api.telefones.DadosCadastroTelefone;

import java.util.List;

public record DadosCadastroCliente(String nome , List<DadosCadastroTelefone> telefones) {
}
