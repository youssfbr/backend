package com.github.youssfbr.clientes.api.domains.addresses;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String cep;
    private String publicPlace;
    private String houseNumber;
    private String supplement;
    private String neighborhood;
    private String city;
    private String uf;
    private String state;
    private String region;
}
