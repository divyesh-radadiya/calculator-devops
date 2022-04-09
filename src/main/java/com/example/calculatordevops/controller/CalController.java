package com.example.calculatordevops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CalController {
    Logger logger = LoggerFactory.getLogger(CalController.class);

    @RequestMapping("/hello")
    String hello() {
        return "Hello World, Spring Boot!";
    }

    @RequestMapping(value = "/getpower",method = RequestMethod.POST)
    public double getPower(@RequestBody Map<String,Object> payload){
        double res;

        double input1 = Double.parseDouble((String) payload.get("input1"));
        double input2 = Double.parseDouble((String) payload.get("input2"));
        logger.info("[POWER] - " + input1+" "+input2);

        res = Math.pow(input1,input2);
        logger.info("[RESULT] - " + res);
        return res  ;
    }


    @RequestMapping(value = "/getsqrt",method = RequestMethod.POST)
    public double getSqrt(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
//        logger.info("[SQRT] - " + input1);
        res = Math.sqrt(input1) ;
//        logger.info("[RESULT] - " + res);
        return res  ;
    }

    @RequestMapping(value = "/getfact",method = RequestMethod.POST)
    public double getFact(@RequestBody Map<String,Object> payload){
        double res= 1;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        for(double i=1;i<=input1;i++)
            res = res*i;

        return res;
    }

    @RequestMapping(value = "/getlog",method = RequestMethod.POST)
    public double getLog(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        res = Math.log(input1);
        return res  ;
    }
}
