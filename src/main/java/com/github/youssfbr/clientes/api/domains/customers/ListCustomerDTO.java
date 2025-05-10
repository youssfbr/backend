package com.github.youssfbr.clientes.api.domains.customers;

import com.github.youssfbr.clientes.api.domains.phones.ListPhoneDTO;

import java.util.List;

public record ListCustomerDTO(
        Long id ,

        String fullName ,

        String firstName ,

        String lastName ,

        String cpf ,

        String birthDate ,

        String email ,

        String note ,

        List<ListPhoneDTO> phones
) {
    public ListCustomerDTO(Customer entity) {
        this(
                entity.getId() ,
                entity.getFullName() ,
                entity.getFirstName() ,
                entity.getLastName() ,
                entity.getCpf() ,
                String.valueOf(entity.getBirthDate()) ,
                entity.getEmail() ,
                entity.getNote() ,

                entity.getPhones()
                        .stream()
                        .map(ListPhoneDTO::new)
                        .toList()
        );
    }
}
