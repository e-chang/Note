package com.course.testNg;/**
 * @Auther: wang
 * @Date: 2019/7/2 14:01
 */

import org.testng.annotations.Test;

/**
 * @author:
 * @date:
 */
public class dependTest {
    @Test
    public void  test1(){
        System.out.println("test1 run");
        throw new RuntimeException("异常");
    }
    @Test(dependsOnMethods = {"test1"})
    public void  test2(){
        System.out.println("test2 run");
    }
}
