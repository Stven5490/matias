package com.ecsa.divisas.repository;

import com.ecsa.divisas.model.currencyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface currencyRepository extends JpaRepository<currencyModel, Long> {

}
