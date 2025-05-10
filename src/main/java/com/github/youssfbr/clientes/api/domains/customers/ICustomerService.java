package com.github.youssfbr.clientes.api.domains.customers;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public interface ICustomerService {

    CustomerPageDTO list(@PositiveOrZero int page , @Positive @Max(100) int size , String direction , String orderBy);
    void createCustomer(CreateCustomerDTO dto);
}
