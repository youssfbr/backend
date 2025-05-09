package com.github.youssfbr.clientes.api.domains.addresses;

public record CreateAddressDTO(
        String cep ,
        String publicPlace ,
        String houseNumber ,
        String supplement ,
        String neighborhood ,
        String city ,
        String uf ,
        String state ,
        String region
) {
}
