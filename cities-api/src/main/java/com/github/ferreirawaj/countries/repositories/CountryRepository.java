package com.github.ferreirawaj.countries.repositories;

import com.github.ferreirawaj.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
