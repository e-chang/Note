package com.course.testNg;/**
 * @Auther: wang
 * @Date: 2019/7/2 08:23
 */

import org.testng.annotations.*;

/**
 * @author:
 * @date:
 */
public class Basic {
    //最基本的注解，标记为用例的一部分
    @Test
    public void testCase1() {
        System.out.println("用例1");

    }

    @Test
    public void testCase2() {
        System.out.println("用例2");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("用例之前运行");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("用例之后运行");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass这是类之前运行的方法");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是类之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite套件");
    }


}