package com.github.youssfbr.clientes.api.domains.telefones;

import com.github.youssfbr.clientes.api.domains.clientes.Cliente;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "telefones")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;

    public Telefone() {}

    public Telefone(Long id, String numero, Cliente cliente) {
        this.id = id;
        this.numero = numero;
        this.cliente = cliente;
    }

    public Telefone(String numero , Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Telefone telefone = (Telefone) o;
        return Objects.equals(id , telefone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
