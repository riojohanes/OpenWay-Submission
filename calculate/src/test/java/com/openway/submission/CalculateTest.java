package com.openway.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateTest 
{
    @Test
    public void testPositiveNumbers(){
        double result = Calculate.calculate(1, 2, 2, 1);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void testNegativeNumbers(){
        double result = Calculate.calculate(-1, -2, -2, -1);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void testMixedSigns(){
        double result = Calculate.calculate(-1, 2, 2, -1);
        Assert.assertEquals(result, 1.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testZeroDivision(){
        Calculate.calculate(1, 2, 3, -3);
    }

    @Test
    public void testZeroDenominator(){
        double result = Calculate.calculate(-2, 2, 3, 4);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testLargeNumbers(){
        double result = Calculate.calculate(1e10, 2e10, 1e10, 2e10);
        Assert.assertEquals(result, 1.0);
    }

    @Test
    public void testSmallNumbers(){
        double result = Calculate.calculate(1e-10, 2e-10, 1e-10, 2e-10);
        Assert.assertEquals(result, 1.0);
    }

    // @Test(expectedExceptions = IllegalArgumentException.class)
    // public void testWrongInput(){
    //     Calculate.calculate("a", "b", "c", "d")
    // }
}
