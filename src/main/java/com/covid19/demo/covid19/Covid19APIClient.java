package com.covid19.demo.covid19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Covid19APIClient {

    @Autowired
    private RestTemplate restTemplate;

    public Summary getSummary(){
        return restTemplate.getForObject(
                "https://api.covid19api.com/summary", Summary.class);
    }

    public Global getGlobal() {
        return (restTemplate.getForObject(
                "https://api.covid19api.com/summary", Summary.class)).getGlobal();
    }



}
