package com.github.youssfbr.clientes.api.domains.clientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
