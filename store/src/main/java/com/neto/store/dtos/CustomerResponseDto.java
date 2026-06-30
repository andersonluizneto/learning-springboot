package com.neto.store.dtos;

import java.util.UUID;

public record CustomerResponseDto(
		UUID id,
		String name,		
		String cpfCnpj,		
		String email,
		String phone		
) {}

