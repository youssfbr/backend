package com.github.youssfbr.clientes.api.domains.customers;

import com.github.youssfbr.clientes.api.domains.addresses.Address;
import com.github.youssfbr.clientes.api.domains.phones.Phone;
import jakarta.persistence.Embedded;

import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private Long id;
    private String fullName;
    private String firstName;
    private String lastName;
    private String email;
    private String cpf;
    private LocalDate birthDate;
    private String note;

    private Set<Phone> phones = new HashSet<>();
    private Address address;

    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
}
