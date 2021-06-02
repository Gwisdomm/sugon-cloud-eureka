package com.sugon.gaowz.util;

/**
 * @author gaowz
 * @version 2.10
 * @ClassName TimeMillsTest.java
 * @Description TODO
 * @createTime 2021年06月01日 14:07:00
 */
public class TimeMillsTest {
    public static void main(String[] args) {
        long curtime = System.currentTimeMillis();
        long sqlTime = 1622526502625l;
        System.out.println(curtime-sqlTime);
        System.out.println("28800000");
    }
}
