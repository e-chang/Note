package com.course.testNg;/**
 * @Auther: wang
 * @Date: 2019/7/2 10:46
 */

import org.testng.annotations.Test;

/**
 * @author:
 * @date:
 */
public class ignoreTest {


    @Test(enabled = false)
    public void ignore1(){
        System.out.println("期望不执行");
    }
    @Test(enabled = true)
    public void ignore2(){
        System.out.println("期望执行");
    }
}
