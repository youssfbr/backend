package com.github.youssfbr.clientes.api.domains.clientes;

import com.github.youssfbr.clientes.api.domains.telefones.DadosCadastroTelefone;

import java.util.List;

public record DadosCadastroCliente(String nome , List<DadosCadastroTelefone> telefones) {
}
