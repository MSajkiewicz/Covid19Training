package com.covid19.demo.covid19;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid")
public class covidController {

    @RequestMapping(method = RequestMethod.GET, value = "summary")
    public GlobalDto getGlobalDto(){
        return new GlobalDto(1,1,1,1,1,1);
    }

}
