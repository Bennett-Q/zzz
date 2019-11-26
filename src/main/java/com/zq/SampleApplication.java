package com.zq;

import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

/**
 * Created by zhangq on 2018/10/30.
 */
@SpringBootApplication(scanBasePackages = "com.zq")
@ServletComponentScan
@Controller
@MapperScan("com.zq.mapper")
public class SampleApplication{

    @RequestMapping("/cat")
    @ResponseBody
    public String home(){
        String[] xqsList = {"萧山区","余杭区","富阳区","临安市","临安市昌化","建德市","桐庐县","淳安县","市郊"};
        for (int i = 0; i <xqsList.length ; i++) {
            if(xqsList[i].equals("萧山区")){
                continue;
            }
            System.out.println(i+"---"+xqsList[i]);
        }
        return "hello springBoot!";
    }

//    @RequestMapping("/hello")
//    @ResponseBody
//    public String hello(){
//        // 初始化Redis连接池
//        Jedis jedis = new Jedis("127.0.0.1");
//        User user = new User();
//        user.setId(1);
//        user.setUsername("张三");
//        user.setPassword("123456");
//        user.setAge(25);
//        user.setTel(1594950565);
//        // 从连接池中获取一个连接
//        String a = jedis.get("b");
//        jedis.set("user".getBytes(),serialize(user));
//        System.out.println(a);
//        byte[] byteUser = jedis.get("user".getBytes());
//
//        user = (User)deserialize(byteUser);
//
//        return user.toString();
//    }
    @Test
    public void test(){
        System.out.println(121);
    }
    public static void main(String[] args) {
//        isAdd(true);
//        toChinese();
        SpringApplication.run(SampleApplication.class, args);
//        Map<Integer,String> map = new HashMap<Integer, String>();
//        map.put(1,"张1");
//        map.put(2,"张2");
//        map.put(3,"张3");
//        for(Map.Entry<Integer,String> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"--"+ entry.getValue());
//        }
//
//        Iterator<Map.Entry<Integer,String>> entry = map.entrySet().iterator();
//        while(entry.hasNext()){
//            System.out.println(entry.next().getKey());
//            System.out.println(entry.next().getValue());
//        }
//
//        for(Integer key:map.keySet()){
//            System.out.println("Key = " + key);
//        }
//        for(String value:map.values()){
//            System.out.println("value = " + value);
//        }
    }
    //判断是否奇数
    public static void isAdd(boolean isContinue){
        if(isContinue){
            System.out.print("请输入数字：");
            Scanner input=new Scanner(System.in);
            int fraction=input.nextInt();
            System.out.println((fraction % 2) != 0);
            System.out.println((fraction & 1) == 1);
        }
        System.out.print("是否继续 Y/N：");
        Scanner input=new Scanner(System.in);
        String fraction=input.next();
        if(fraction.toUpperCase().equals("Y")){
        System.out.println("-----------------------------------------------");
            isAdd(true);
        }else{
            return;
        }
    }
    private static String toChinese() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = scanner.next();
        String[] s1 = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
        String[] s2 = { "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千" };
        String result = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int num = str.charAt(i) - '0';
            if (i != n - 1 && num != 0) {
                result += s1[num] + s2[n - 2 - i];
            } else {
                result += s1[num];
            }
        }
        System.out.println(result);
        System.out.print("是否继续 Y/N：");
        Scanner input=new Scanner(System.in);
        String fraction=input.next();
        if(fraction.toUpperCase().equals("Y")){
            System.out.println("-----------------------------------------------");
            toChinese();
        }else{
            return result;
        }
        return result;
    }

}
