package com.course.testNg.paramter;/**
 * @Auther: wang
 * @Date: 2019/7/2 14:09
 */

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author:
 * @date:
 */
public class paramterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name, int age) {
        System.out.println("name=" + name +"/"+ "age" + age);
    }

}
