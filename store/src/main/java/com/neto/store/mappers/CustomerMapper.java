package com.neto.store.mappers;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.neto.store.dtos.CustomerRequestDto;
import com.neto.store.dtos.CustomerResponseDto;
import com.neto.store.models.CustomerModel;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

	@Mapping(target = "id", ignore = true)
	CustomerModel toModel(CustomerRequestDto dto);
	
	CustomerResponseDto toResponseDto(CustomerModel customer);
}
