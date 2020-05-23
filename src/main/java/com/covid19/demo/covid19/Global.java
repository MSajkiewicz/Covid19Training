package com.covid19.demo.covid19;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Global {

    @JsonProperty("NewConfirmed")
    int NewConfirmed;
    @JsonProperty("TotalConfirmed")
    int TotalConfirmed;
    @JsonProperty("NewDeaths")
    int NewDeaths;
    @JsonProperty("TotalDeaths")
    int TotalDeaths;
    @JsonProperty("NewRecovered")
    int NewRecovered;
    @JsonProperty("TotalRecovered")
    int TotalRecovered;

}
