package com.test;

public class 多边形重心问题 {

    /*
    描述
无穷数列1，1，2，3，5，8，13，21，34，55...称为Fibonacci数列，它可以递归地定义为
F(n)=1 ...........(n=1或n=2)
F(n)=F(n-1)+F(n-2).....(n>2)
现要你来求第n个斐波那契数。（第1个、第二个都为1)
输入
第一行是一个整数m(m<5)表示共有m组测试数据
每次测试数据只有一行，且只有一个整形数n(n<20)
输出
对每组输入n，输出第n个Fibonacci数
    */

    public static void main(String[] args){
        System.out.println(fibonacci(30));

    }

    public static int fibonacci(int target){
        if(target == 1 || target == 2){
            return 1;
        }else{
            return fibonacci(target-1) + fibonacci(target-2);
        }

    }

}
