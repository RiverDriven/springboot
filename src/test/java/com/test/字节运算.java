package com.test;

public class 字节运算 {

    public static void main(String[] args){

        Integer number = 0xF;
        String s = Integer.toString(number);

        System.out.println(String.format("Integer.toString 十六进制结果 : %s ",s));


    }

}
