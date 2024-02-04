package com.eBanckend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eBanckend.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
