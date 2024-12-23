package com.ecsa.divisas.repository;

import com.ecsa.divisas.model.transactionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface transactionRepository extends JpaRepository<transactionModel, Long> {
}
