package com.github.youssfbr.clientes.api.domains.phones;

public record ListPhoneDTO(

        Long id ,

        PhoneType type ,

        String number
) {
    public ListPhoneDTO(Phone entity) {
        this(
                entity.getId() ,
                entity.getType() ,
                entity.getNumber()
        );
    }
}
