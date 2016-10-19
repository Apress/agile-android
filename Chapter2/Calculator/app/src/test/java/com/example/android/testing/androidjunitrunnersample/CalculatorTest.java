package com.example.android.testing.androidjunitrunnersample;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void calculator_CorrectAdd_ReturnsTrue() {
        assertEquals(7,mCalculator.add(3, 4),0);
        assertEquals(7,mCalculator.add(4, 3),0);
        assertEquals(10,mCalculator.add(8, 2),0);
        assertEquals(3,mCalculator.add(-1, 4),0);
        assertEquals(3260,mCalculator.add(3256, 4),0);
    }

    @Test
    public void calculator_CorrectSub_ReturnsTrue() {
        assertEquals(1,mCalculator.sub(4, 3),0);
    }

    @Test
    public void calculator_CorrectMul_ReturnsTrue() {
        assertEquals(12, mCalculator.mul(3, 4),0);
    }

    @Test
    public void calculator_CorrectDiv_ReturnsTrsue() {
        assertEquals(3, mCalculator.div(12, 4),0);
    }

    @After
    public void tearDown() {
        mCalculator = null;
    }
}