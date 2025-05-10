package com.github.youssfbr.clientes.api.domains.customers;

import com.github.youssfbr.clientes.api.infra.exceptions.ResourceNotFoundException;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public CustomerPageDTO list(@Positive int page , @Positive @Max(10) int size , String direction , String orderBy) {

        final Page<Customer> pageResult = customerRepository
                .findAllPageByActiveTrue(PageRequest.of(page , size , Sort.Direction.valueOf(direction) , orderBy));

        final List<ListCustomerDTO> customers = pageResult.get().map(ListCustomerDTO::new).toList();

        return new CustomerPageDTO(customers , pageResult.getTotalElements() , pageResult.getTotalPages());
    }

    @Override
    @Transactional(readOnly = true)
    public CustomerDetailDTO detail(@Positive @NotNull Long id) {
        return new CustomerDetailDTO(getReferenceById(id));
    }

    @Override
    @Transactional
    public void createCustomer(CreateCustomerDTO dto) {
        customerRepository.save(new Customer(dto));
    }

    private Customer getReferenceById(Long id) {
        return  customerRepository.getReferenceByIdAndActiveTrue(id)
                .orElseThrow(() -> new ResourceNotFoundException("Resource with ID " + id + " Not found"));
    }

}
