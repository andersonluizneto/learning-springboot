package com.neto.store.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record CustomerRequestDto(
		@NotNull(message = "Name is required")
		String name,
		
		@NotNull(message = "Cpf/Cnpj is required")
		@Max(value = 14, message = "Cpf/Cnpj must have 14 digitis max")
		@Min(value = 11, message = "Cpf/Cnpj must have 11 digitis min")		
		String cpfCnpj,
		
		@NotNull(message = "Email is required")
		@Email(message = "Invalid format email")
		String email,
		@Max(value = 13, message = "Max 13 digitis")
		String phone		
) {}
