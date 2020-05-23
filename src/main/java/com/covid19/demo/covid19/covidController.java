package com.covid19.demo.covid19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid")
public class covidController {

    @Autowired
    Covid19APIClient covid19APIClient;

    @Autowired
    Mapper mapper;

    @RequestMapping(method = RequestMethod.GET, value = "summary")
    public SummaryDto getSummary(){
        return mapper.mapToSummaryDto(covid19APIClient.getSummary());
    }

    @RequestMapping(method = RequestMethod.GET, value = "global")
    public GlobalDto getGlobal(){
        return mapper.mapToGlobalDto(covid19APIClient.getGlobal());
    }

    @RequestMapping(method = RequestMethod.GET, value = "countries")
    public CountryDto[] getCountries(){
        return mapper.mapToCountriesDto(covid19APIClient.getCountries());
    }

    @RequestMapping(method = RequestMethod.GET, value = "country")
    public CountryDto getCountry(@RequestParam String country) {
        CountryDto[] countries = mapper.mapToCountriesDto(covid19APIClient.getCountries());
        CountryDto result = null;
        for(int i = 0; i<countries.length; i++) {
            if(countries[i].getCountry().equals(country)) {
                result = countries[i];
            }
        }
        return result;
    }
}
