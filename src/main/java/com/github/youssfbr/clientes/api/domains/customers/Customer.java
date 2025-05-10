package com.github.youssfbr.clientes.api.domains.customers;

import com.github.youssfbr.clientes.api.domains.addresses.Address;
import com.github.youssfbr.clientes.api.domains.phones.Phone;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "tb_customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String fullName;

    @Column(length = 20)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column(length = 100, unique = true)
    private String email;

    @Column(length = 14, unique = true)
    private String cpf;

    private LocalDate birthDate;

    @Column(columnDefinition = "text")
    private String note;


    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Phone> phones = new ArrayList<>();

    @Embedded
    private Address address;

    private boolean active;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedAt;

    public Customer() {}

    public Customer(Long id, String fullName, String firstName, String lastName, String email, String cpf,
                    LocalDate birthDate, String note, List<Phone> phones, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.note = note;
        this.phones = phones;
        this.address = address;
    }

    public Customer(CreateCustomerDTO dto) {
        this.fullName = dto.fullName();
        this.firstName = dto.firstName();
        this.lastName = dto.lastName();
        this.email = (!Objects.equals(dto.email() , "")) ? dto.email() : null;
        this.cpf = (!Objects.equals(dto.cpf() , "")) ? dto.cpf() : null;
        this.birthDate = dto.birthDate() != null ? LocalDate.parse(dto.birthDate()) : null;
        this.note = dto.note();

        dto.phones().forEach(phoneDTO -> {
            final Phone phone = new Phone(phoneDTO, this);
            phones.add(phone);
        });

        this.address = new Address(dto.address());
    }



    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getNote() {
        return note;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public Address getAddress() {
        return address;
    }

    @PrePersist
    public void prePersist() {
        active = Boolean.TRUE;
        createdAt = Instant.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = Instant.now();
    }

    public void inactivate() {
        active = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;
        return Objects.equals(id , customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
