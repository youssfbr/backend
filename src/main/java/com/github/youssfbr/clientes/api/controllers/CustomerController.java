package com.github.youssfbr.clientes.api.controllers;

import com.github.youssfbr.clientes.api.domains.customers.CreateCustomerDTO;
import com.github.youssfbr.clientes.api.domains.customers.CustomerDetailDTO;
import com.github.youssfbr.clientes.api.domains.customers.CustomerPageDTO;
import com.github.youssfbr.clientes.api.domains.customers.ICustomerService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/pageV2")
    public CustomerPageDTO list(
            @RequestParam(defaultValue = "0") @PositiveOrZero int page ,
            @RequestParam(defaultValue = "10") @Positive @Max(100) int size ,
            @RequestParam(required = false) String direction ,
            @RequestParam(required = false) String orderBy
    ) {
        return customerService.list(page , size , direction , orderBy);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDetailDTO> detail(@PathVariable @NotNull @Positive Long id) {
        return ResponseEntity.ok(customerService.detail(id));
    }

    @PostMapping
    public void create(@Valid @RequestBody CreateCustomerDTO dto) {
        customerService.createCustomer(dto);
    }
}
