package com.ecsa.divisas.repository;

import com.ecsa.divisas.model.currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface currencyRepository extends JpaRepository<currency, Long> {
}
