package com.example.calculatordevops.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@RestController
public class CalController {
    private static final Logger logger = LogManager.getLogger(CalController.class);

    @RequestMapping("/hello")

    String hello() {
        return "Hello World, Spring Boot!";
    }


    @RequestMapping(value = "/getSqrt",method = RequestMethod.POST)
    public double getSqrt(@RequestBody Map<String,String> body){

        double input1 = Double.parseDouble(body.get("input1"));

//        logger.info("[SQRT] - " + input1);

        double res = Math.sqrt(input1) ;

//        logger.info("[RESULT] - " + res);

        return res  ;
    }

    @RequestMapping(value = "/getFact",method = RequestMethod.POST)
    public double getFact(@RequestBody Map<String,String> body){

        double input1 = Double.parseDouble( body.get("input1"));

        double res= 1;

        for(double i=1;i<=input1;i++)
            res *= i;

        return res;
    }

    @RequestMapping(value = "/getLog",method = RequestMethod.POST)
    public double getLog(@RequestBody Map<String,String> body){

        double input1 = Double.parseDouble(body.get("input1"));

        double res = Math.log(input1);

        return res  ;
    }

    @RequestMapping(value = "/getPower",method = RequestMethod.POST)
    public double getPower(@RequestBody Map<String,String> body){

        double input1 = Double.parseDouble(body.get("input1"));

        double input2 = Double.parseDouble( body.get("input2"));

        logger.info("[POWER] - " + input1+" "+input2);

        double res = Math.pow(input1,input2);

        logger.info("[POWER_RESULT] - " + res);

        return res  ;
    }
}
