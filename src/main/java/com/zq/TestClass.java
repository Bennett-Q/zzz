package com.zq;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 张琪
 * @description 测试
 * @date 2019/8/14 13:33
 */
public class TestClass {
    @Test
    public void test(){
        System.out.println(121);
    }
    /*
    *
     * @Author 张琪
     * @Description //TODO 分离字符串中的中文和数字
     * @Date 2019/9/16 14:23 
     * @Param []
     * @return void
     **/
    @Test
    public void test2() {
        String str = "love23next234csdn3423javaeye";
        List<String> list = new ArrayList<String>();
        Object obj = new Object();
        str=str.trim();
        String str_string="";
        String str_int="";
        if(str != null && !"".equals(str)){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    str_int+=str.charAt(i);
                }else{
                    str_string+=str.charAt(i);
                }
            }
        }
        list.add(str_int);
        list.add(str_string);
        System.out.println(str_int);
        System.out.println(str_string);
    }
    /*
    *
     * @Author 张琪
     * @Description //TODO 极简排序
     * @Date 2019/9/16 15:05 
     * @Param []
     * @return void
     **/
    @Test
    public void test3(){
        List<String> names = Arrays.asList("zhangsan","apple","pear","lisi","wangwu");
        //正序
        names.sort((a,b) -> a.compareTo(b));
        //倒序
        names.sort((a,b) -> b.compareTo(a));
        System.out.println(names);

        //过滤
        names.stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
    }

    @Test
    public boolean isOdd(){
        System.out.print("请输入分数：");
        Scanner input=new Scanner(System.in);
        int fraction=input.nextInt();
        return (fraction % 2) == 0;
    }
}
