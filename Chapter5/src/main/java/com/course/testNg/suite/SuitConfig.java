package com.course.testNg.suite;/**
 * @Auther: wang
 * @Date: 2019/7/2 09:54
 */

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author:
 * @date:
 */
public class SuitConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("套件前");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("套件后");
    }
}
