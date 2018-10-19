package com.test;

import java.util.Collections;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class SuanFa {

    /*在，有一行括号序列，请你检查这行括号是否配对。
    输入
    第一行输入一个数N（0<N<=100）,表示有N组测试数据。后面的N行输入多组输入数据，每组输入数据都是一个字符串S(S的长度小于10000，且S不是空串），测试数据组数少于5组。数据保证S中只含有"[", "]", "(", ")" 四种字符
    输出
    每组输入数据的输出占一行，如果该字符串中所含的括号是配对的，则输出Yes,如果不配对则输出No
    */



    public static void main(String[] args){


        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        char[] sourceChar = new char[]{'{','{','b','{','}','X'};
        Random random = new Random();
        for (int i = 0; i <20000000 ; i++) {
            sb.append('{');
        }
        for (int i = 0; i <20000000 ; i++) {
            sb.append(sourceChar[random.nextInt(sourceChar.length-1)]);
        }

        //isMatch(sb.toString());
        isMatchStack(sb.toString());

        System.out.println(String.format("耗时(毫秒) : %s",(System.currentTimeMillis()- start)));

    }



    public static boolean isMatch(String str) {
        Boolean flag = false;
        //"{}"
        char[] chars = str.toCharArray();
        int preCount = 0;
        int suffixCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '{'){preCount++;}
            if(chars[i] == '}'){suffixCount++;}
            if(suffixCount > preCount){
                flag  = false;
                break;
            }


        }
        if(!flag){
            System.err.println(
                    String.format("无法闭合 pre : %s suffix :%s \n源字符 : %s"
                            ,preCount,suffixCount,str));
        }
        return flag;
    }

    public static boolean isMatchStack(String str) {

        Boolean flag = false;
        //"{}"
        char[] chars = str.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '{'){stack.push(chars[i]);}
            try {
                if(chars[i] == '}'){stack.pop();}
            }catch(ArrayIndexOutOfBoundsException e){
                flag = false;
            }

        }

        if(!flag){
            System.err.println(
                    String.format("无法闭合 容量 : %s ",stack.capacity()));
        }

        return flag;
    }

}
