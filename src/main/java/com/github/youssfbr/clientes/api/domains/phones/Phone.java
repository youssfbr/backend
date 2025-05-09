package com.github.youssfbr.clientes.api.domains.phones;

import com.github.youssfbr.clientes.api.domains.customers.Customer;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_phones")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @Column(nullable = false, length = 20)
    private String number;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Phone() {}

    public Phone(Long id, PhoneType type, String number, Customer customer) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.customer = customer;
    }

    public Phone(CreatePhoneDTO phoneDTO , Customer customer) {
        this.type = phoneDTO.type();
        this.number = phoneDTO.number();
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public PhoneType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;
        return Objects.equals(id , phone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
