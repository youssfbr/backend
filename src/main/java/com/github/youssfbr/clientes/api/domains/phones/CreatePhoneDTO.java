package com.github.youssfbr.clientes.api.domains.phones;

public record CreatePhoneDTO(
        PhoneType type ,
        String number
) {
}
