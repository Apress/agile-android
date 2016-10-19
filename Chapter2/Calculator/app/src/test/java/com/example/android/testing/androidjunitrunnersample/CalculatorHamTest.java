package com.example.android.testing.androidjunitrunnersample;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.both;

import org.junit.Before;

public class CalculatorHamTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void calculator_CorrectHamAdd_ReturnsTrue() {
        assertThat(mCalculator.add(3, 4), both(greaterThan(6)).and(lessThan(8)));
    }
}