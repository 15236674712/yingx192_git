package com.baizhi.yingx192_git;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Yingx192Tests {

    @Test
    public void contextLoads() {
        System.out.println("====");
        System.out.println("====");
        System.out.println("==Github==");
        int a = 20;
        System.out.println(a);
        System.out.println("==========");
        int bbb=30;
        int ccc=20;
        for (int i = 0; i < 100; i++) {
             ccc=bbb+ccc;
        }
        int aaa = 18;
        System.out.println(aaa + ccc);
        System.out.println("-----");

    }

}
