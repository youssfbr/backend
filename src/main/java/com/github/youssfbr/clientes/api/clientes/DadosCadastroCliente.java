package com.github.youssfbr.clientes.api.clientes;

import com.github.youssfbr.clientes.api.telefones.DadosTelefone;

import java.util.List;

public record DadosCadastroCliente(String nome , List<DadosTelefone> telefones) {
}
