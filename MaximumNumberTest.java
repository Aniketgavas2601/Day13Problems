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

    //TC 2.1 - Given Maximum  Float Number at First Position return the Same Number
    @Test
    public void getMaximumFloatNumberAtFirstPosition(){
        MaximumNumber maximumFloatNumber = new MaximumNumber(4.5f, 2.3f, 3.3f);
        Assert.assertEquals(4.5f, maximumFloatNumber.maximum());
    }

    //TC 2.2 - Given Maximum  Float Number at Second Position return the Same Number
    @Test
    public void getMaximumFloatNumberAtSecondPosition(){
        MaximumNumber maximumFloatNumber = new MaximumNumber(2.3f, 4.5f, 3.3f);
        Assert.assertEquals(4.5f, maximumFloatNumber.maximum());
    }

    //TC 2.3 - Given Maximum  Float Number at Third Position return the Same Number
    @Test
    public void getMaximumFloatNumberAtThirdPosition(){
        MaximumNumber maximumFloatNumber = new MaximumNumber(3.3f, 2.3f, 4.5f);
        Assert.assertEquals(4.5f,maximumFloatNumber.maximum());
    }

    //TC 3.1 - Maximum String at First Position return the Same String
    @Test
    public void getMaximumStringAtFirstPosition(){
        MaximumNumber maximumString = new MaximumNumber("Tushar","Aniket","Sai");
        Assert.assertEquals("Tushar",maximumString.maximum());
    }

    //TC 3.2 - Maximum String at First Position return the Same String
    @Test
    public void getMaximumStringAtSecondPosition(){
        MaximumNumber maximumString = new MaximumNumber("Aniket","Tushar","Sai");
        Assert.assertEquals("Tushar", maximumString.maximum());
    }

    //TC 3.3 - Maximum String at Third Position return the Same String
    @Test
    public void getMaximumStringAtThirdPosition(){
        MaximumNumber maximumString = new MaximumNumber("Sai","Aniket","Tushar");
        Assert.assertEquals("Tushar",maximumString.maximum());
    }
}
