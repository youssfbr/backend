package com.github.youssfbr.clientes.api.domains.customers;

import java.util.List;

public record CustomerPageDTO(
        List<ListCustomerDTO> customers,
        long totalElements,
        int totalPages
) {
}
