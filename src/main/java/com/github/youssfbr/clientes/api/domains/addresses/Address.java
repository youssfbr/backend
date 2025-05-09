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

    public Address() {}

    public Address(String cep, String publicPlace, String houseNumber, String supplement, String neighborhood,
            String city, String uf, String state, String region) {
        this.cep = cep;
        this.publicPlace = publicPlace;
        this.houseNumber = houseNumber;
        this.supplement = supplement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.uf = uf;
        this.state = state;
        this.region = region;
    }

    public Address(CreateAddressDTO address) {
        this.cep = address.cep();
        this.publicPlace = address.publicPlace();
        this.houseNumber = address.houseNumber();
        this.supplement = address.supplement();
        this.neighborhood = address.neighborhood();
        this.city = address.city();
        this.uf = address.uf();
        this.state = address.state();
        this.region = address.region();
    }

    public String getCep() {
        return cep;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getSupplement() {
        return supplement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
    }

    public String getState() {
        return state;
    }

    public String getRegion() {
        return region;
    }
}
