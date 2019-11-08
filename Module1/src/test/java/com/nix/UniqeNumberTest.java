package com.nix;

import org.junit.Assert;
import org.junit.Test;


public class UniqeNumberTest {
    @Test
    public void mainTest(){
        long result = new UniqueNumber().uniqeNumber(new int [] {1,1,4,5,1,3});
        Assert.assertEquals(4, result );
    }
}
