package com.bridgelabz.generics;

import org.junit.Assert;

import org.junit.Test;

public class MaximumNumberTest {
    //TC 1.1 - Given Maximum Number at first Position return the same Number
    @Test
    public void getMaximumNumberAtFirstPosition(){
        MaximumNumber maximumNumber = new MaximumNumber(45,26,34);
        Assert.assertEquals(45,maximumNumber.maximum());
    }

    //TC 1.2 - Given Maximum Number at Second Position return the same Number
    @Test
    public void getMaximumNumberAtSecondPosition(){
        MaximumNumber maximumNumber = new MaximumNumber(26,45,34);
        Assert.assertEquals(45,maximumNumber.maximum());
    }

    //TC 1.3 - Given Maximum Number at third position return the same Number
    @Test
    public void getMaximumNumberAtThirdPosition(){
        MaximumNumber maximumNumber = new MaximumNumber(26,34,45);
        Assert.assertEquals(45,maximumNumber.maximum());
    }
}
