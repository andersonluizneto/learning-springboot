package com.neto.store.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neto.store.models.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, UUID> {
}
