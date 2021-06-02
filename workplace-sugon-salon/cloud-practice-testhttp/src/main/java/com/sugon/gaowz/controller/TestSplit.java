package com.sugon.gaowz.controller;

/**
 * @author gaowz
 * @version 2.10
 * @ClassName TestSplit.java
 * @Description TODO
 * @createTime 2021年05月28日 16:11:00
 */
public class TestSplit {
    public static void main(String[] args){
        String name  = "gao ";
        String[] nameArr = new String[]{name};
        if (name.contains(" ")) {
            nameArr = name.split("\\s+");
        }
        for(int i = 0;i< nameArr.length; i++){
            System.out.println(nameArr[i]);
        }
        System.out.println(nameArr.length);

    }
}
