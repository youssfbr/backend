package com.github.youssfbr.clientes.api.domains.customers;

import com.github.youssfbr.clientes.api.domains.addresses.Address;
import com.github.youssfbr.clientes.api.domains.phones.ListPhoneDTO;

import java.util.List;

public record CustomerDetailDTO(
        Long id ,

        String fullName ,

        String firstName ,

        String lastName ,

        String cpf ,

        String email ,

        String birthDate ,

        String note ,

        List<ListPhoneDTO> phones ,

        Address address
) {
    public CustomerDetailDTO(Customer entity) {
        this(
                entity.getId() ,
                entity.getFullName() ,
                entity.getFirstName() ,
                entity.getLastName() ,
                entity.getCpf() ,
                entity.getEmail() ,
                String.valueOf(entity.getBirthDate()) ,
                entity.getNote() ,

                entity.getPhones()
                        .stream()
                        .map(ListPhoneDTO::new)
                        .toList() ,

                entity.getAddress()
        );
    }
}
