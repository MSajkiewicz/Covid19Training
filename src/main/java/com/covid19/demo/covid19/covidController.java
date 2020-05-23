package com.covid19.demo.covid19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid")
public class covidController {

    @Autowired
    Covid19APIClient covid19APIClient;

    @RequestMapping(method = RequestMethod.GET, value = "summary")
    public Summary getSummary(){
        return covid19APIClient.getSummary();
    }

    @RequestMapping(method = RequestMethod.GET, value = "global")
    public Global getGlobal(){
        return covid19APIClient.getGlobal();
    }


}
