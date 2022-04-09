package com.example.calculatordevops;

import com.example.calculatordevops.controller.CalController;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalTest {
    private static final double DELTA = 1e-15;
    CalController calculator = new CalController();

    @Test
    public void squareRootTruePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("36"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "12.25"));

        assertEquals("Squaring a number for True Positive", 6, calculator.getSqrt(payload), DELTA);
        assertEquals("Squaring a number for True Positive", 3.5, calculator.getSqrt(payload2), DELTA);

    }

    @Test
    public void squareRootFalsePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("36"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "12.25"));
        assertNotEquals("Squaring a number for False Positive", 10, calculator.getSqrt(payload), DELTA);
        assertNotEquals("Squaring a number for False Positive", 2.5, calculator.getSqrt(payload2), DELTA);
    }

}