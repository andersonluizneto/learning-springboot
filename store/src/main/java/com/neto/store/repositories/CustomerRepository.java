package com.neto.store.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neto.store.models.CustomerModel;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, UUID> {
	CustomerModel findCustomerModelByCpfCnpj(String cpfCnpj);
	CustomerModel findCustomerModelByEmail(String email);
}
