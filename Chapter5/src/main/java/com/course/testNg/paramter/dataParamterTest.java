package com.course.testNg.paramter;/**
 * @Auther: wang
 * @Date: 2019/7/2 14:32
 */


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author:
 * @date:
 */
public class dataParamterTest {
    @Test(dataProvider = "hah")
    public void test1(String name, int age) {
        System.out.println("name=" + name + "," + "age=" + age);
    }


    @DataProvider(name = "hah")

    public Object[][] data() {
        Object[][] a = new Object[][]{
                {"q", 1},
        };
        return a;
    }


}
