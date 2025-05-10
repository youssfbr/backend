package com.github.youssfbr.clientes.api.domains.phones;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CreatePhoneDTO(

        @NotNull
        PhoneType type ,

        @Size(max = 20)
        String number
) {
}
