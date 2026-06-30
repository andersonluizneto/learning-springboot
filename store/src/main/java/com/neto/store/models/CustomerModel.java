package com.neto.store.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Table(name = "TB_CUSTOMER")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CustomerModel {

	@Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false, unique = true, length = 14)
	private String cpfCnpj;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, length = 11)	
	private String phone;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderModel> orders;
}
