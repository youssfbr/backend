package com.github.youssfbr.clientes.api.domains.clientes;

import com.github.youssfbr.clientes.api.domains.telefones.DadosCadastroTelefone;
import com.github.youssfbr.clientes.api.domains.telefones.Telefone;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefone> telefones = new ArrayList<>();

    public Cliente(String nome , Long id) {
        this.nome = nome;
        this.id = id;
    }

    public Cliente(DadosCadastroCliente dados) {
        nome = dados.nome();
        for (DadosCadastroTelefone dadosCadastroTelefone : dados.telefones()) {
            Telefone telefone = new Telefone(dadosCadastroTelefone.numero(), this);
            telefones.add(telefone);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;
        return Objects.equals(id , cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
