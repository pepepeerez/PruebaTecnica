package com.vedruna.pruebatecnica.dto;

import com.vedruna.pruebatecnica.persistance.model.Country;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDTO {
    private int idCountry;
    private String countryName;
    private Long population;

    public CountryDTO(Country country){
        this.idCountry = country.getIdCountry();
        this.countryName = country.getCountryName();
        this.population = country.getPopulation();
    }

}
