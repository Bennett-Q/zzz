import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 张琪
 * @description 测试
 * @date 2019/8/14 13:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestClass.class})
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
    public void isOdd(){
        System.out.print("请输入分数：");
        Scanner input=new Scanner(System.in);
        int fraction=input.nextInt();
        System.out.println((fraction % 2) == 0);
    }

    //判断是否奇数
    @Test
    public void isAdd(){
        boolean isContinue = true;
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
            isAdd();
        }else{
            return;
        }
    }
    //数字转中文
    @Test
    public void toChinese() {
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
        }
        System.out.println(result);
    }

}
