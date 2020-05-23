package com.covid19.demo.covid19;

import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public GlobalDto mapToGlobalDto(Global global){
        return new GlobalDto(
                global.getNewConfirmed(),
                global.getTotalConfirmed(),
                global.getNewDeaths(),
                global.getTotalDeaths(),
                global.getNewRecovered(),
                global.getTotalRecovered());
    }

    public CountryDto mapToCountryDto(Country country) {
        return new CountryDto(
                country.getCountry(),
                country.getNewConfirmed(),
                country.getTotalConfirmed(),
                country.getNewDeaths(),
                country.getTotalDeaths(),
                country.getNewRecovered(),
                country.getTotalRecovered());
    }

    public CountryDto[] mapToCountriesDto(Country[] c){
        CountryDto[] countriesDto = new CountryDto[c.length];
        for(int i=0; i<c.length; i++){
            countriesDto[i] = mapToCountryDto(c[i]);
            }
        return countriesDto;
        }

    public SummaryDto mapToSummaryDto(Summary summary){
        CountryDto[] countriesDto = new CountryDto[summary.getCountries().length];
        for(int i=0; i<summary.getCountries().length; i++){
            countriesDto[i] = mapToCountryDto(summary.getCountries()[i]);
        }
        return new SummaryDto(mapToGlobalDto(summary.getGlobal()), countriesDto);
    }


}
