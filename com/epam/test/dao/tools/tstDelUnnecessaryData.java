package com.epam.test.dao.tools;

import com.epam.catalog.dao.tools.DataBaseTools;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class tstDelUnnecessaryData {

    @DataProvider(name = "dp1")
    public Object[][] dProvider1() {
        return new Object[][] {
                {new HashSet<String>(Arrays.asList("a", "b", "c")), "b"},
                {new HashSet<String>(Arrays.asList("asdfdjlk", "sdfhlb", "sdffhkc")), "a"},
        };
    }

    @Test (dataProvider = "dp1")
    public void f2(Set<String> set, String identifier) {
        DataBaseTools dbTools = DataBaseTools.getInstance();
        Assert.assertEquals(dbTools.delUnnecessaryData(set, identifier).size(), 1);
    }


}
