package com.course.testNg.groups;/**
 * @Auther: wang
 * @Date: 2019/7/2 10:53
 */

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author:
 * @date:
 */
public class groupMethod {
    @Test(groups = "services1")
    public void group1(){
        System.out.println("这是group1");

    }
    @Test(groups = "services2")
    public void group2(){
        System.out.println("这是group2");

    }
    @BeforeGroups("services1")
    public void beforeGropsservices1(){
        System.out.println("组运行之前");
    }
    @AfterGroups("services1")
    public void afterGropsservices1(){
        System.out.println("组运行之后");
    }

    @BeforeGroups("services2")
    public void beforeGrops1services2(){
        System.out.println("组运行之前");
    }
    @AfterGroups("services2")
    public void afterGrops2services2(){
        System.out.println("组运行之后");
    }


}
