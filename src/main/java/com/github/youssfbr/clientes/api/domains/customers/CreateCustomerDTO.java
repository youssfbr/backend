package com.github.youssfbr.clientes.api.domains.customers;

import com.github.youssfbr.clientes.api.domains.addresses.CreateAddressDTO;
import com.github.youssfbr.clientes.api.domains.phones.CreatePhoneDTO;

import java.util.Set;

public record CreateCustomerDTO(
        String fullName ,
        String firstName ,
        String lastName ,
        String email ,
        String cpf ,
        String birthDate ,
        String note ,
        Set<CreatePhoneDTO> phones ,
        CreateAddressDTO address
) {
}
