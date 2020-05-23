package com.covid19.demo.covid19;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SummaryDto {
    private GlobalDto globalDto;
    private CountryDto[] countriesDto;
}
