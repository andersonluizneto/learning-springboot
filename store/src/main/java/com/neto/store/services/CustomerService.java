package com.neto.store.services;

import org.springframework.stereotype.Service;

import com.neto.store.dtos.CustomerRequestDto;
import com.neto.store.dtos.CustomerResponseDto;
import com.neto.store.mappers.CustomerMapper;
import com.neto.store.models.CustomerModel;
import com.neto.store.repositories.CustomerRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
	private final CustomerRepository repository;
	private final CustomerMapper customerMapper;
	
	@Transactional
	public CustomerResponseDto create(CustomerRequestDto dto) {
		CustomerModel customer = customerMapper.toModel(dto);
		CustomerModel savedCustomer = repository.save(customer);
		return customerMapper.toResponseDto(savedCustomer);
	}

}
