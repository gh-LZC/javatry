package com.frame.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * @class AllTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/4/28 13:34
 * @Version 1.0
 */
@SuiteClasses({JunitTest.class,JunitTest1.class})
@RunWith(Suite.class)
public class AllTest {
}
