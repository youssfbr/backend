package com.github.youssfbr.clientes.api.domains.addresses;

import jakarta.validation.constraints.Size;

public record CreateAddressDTO(

        @Size(max = 11)
        String cep ,

        @Size(max = 100)
        String publicPlace ,

        @Size(max = 20)
        String houseNumber ,

        @Size(max = 40)
        String supplement ,

        @Size(max = 30)
        String neighborhood ,

        @Size(max = 20)
        String city ,

        @Size(max = 2)
        String uf ,

        @Size(max = 20)
        String state ,

        @Size(max = 20)
        String region
) {
}
