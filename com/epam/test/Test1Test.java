package com.epam.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test1Test {


    public int sum(int i, int j){
        return i + j;
    }



    @DataProvider(name = "dp1")
    public Object[][] dProvider1() {
        return new Object[][] {
               // {1 ,1},
                {1 ,2},
        };
    }

    @Test (dataProvider = "dp1")
    public void f2(int i, int j) {
        Assert.assertEquals(sum(i,j), 3);
    }


}