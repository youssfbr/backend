package com.github.youssfbr.clientes.api.domains.phones;

public enum PhoneType {

    WHATSAPP("WhatsApp") ,
    CELULAR("Celular") ,
    RESIDENCIAL("Residencial") ,
    COMERCIAL("Comercial");

    private final String description;

    PhoneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
