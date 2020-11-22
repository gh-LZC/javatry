package com.frame.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @class JunitTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/4/28 10:24
 * @Version 1.0
 */
public class JunitTest {
    @Test
    public void junitTest(){
        Junit junit = new Junit();
        Assert.assertEquals(1,junit.junit(true));
        Assert.assertEquals(3,junit.junit(true));
    }
}
