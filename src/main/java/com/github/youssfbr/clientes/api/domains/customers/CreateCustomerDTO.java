package com.github.youssfbr.clientes.api.domains.customers;

import com.github.youssfbr.clientes.api.domains.addresses.CreateAddressDTO;
import com.github.youssfbr.clientes.api.domains.phones.CreatePhoneDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Set;

public record CreateCustomerDTO(

        @NotBlank(message = "{fullName.required}")
        @Size(min = 2, max = 100, message = "{fullName.size}")
        String fullName ,

        @NotBlank(message = "{firstName.required}")
        @Size(min = 2, max = 20, message = "{firstName.size}")
        String firstName ,

        @NotBlank(message = "{lastName.required}")
        @Size(min = 2, max = 20, message = "{lastName.size}")
        String lastName ,

        @Email
        @Size(max = 100)
        String email ,

        @Pattern(regexp = "^(?:\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}|)$", message = "O CPF é inválido")
        String cpf ,

        String birthDate ,

        String note ,

        @Valid
        Set<CreatePhoneDTO> phones ,

        @Valid
        CreateAddressDTO address
) {
}
