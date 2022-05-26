package org.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping(value="/testValue", method = RequestMethod.GET)
    public String getTestValue(){
        String testValue = "restController 테스트";
        return testValue;
    }
}
