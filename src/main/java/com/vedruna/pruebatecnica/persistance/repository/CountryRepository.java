package com.vedruna.pruebatecnica.persistance.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.pruebatecnica.persistance.model.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}