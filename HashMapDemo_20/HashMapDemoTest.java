package HashMapDemo_20;

import java.util.HashMap;

public class HashMapDemoTest {
    public static void main(String[] args) {
        //创建对象
        HashMap<Student,String> hm=new HashMap<>();
        //创建学生
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        //添加学生
        hm.put(s1,"江苏");
        hm.put(s2,"安徽");
        hm.put(s3,"上海");
        //遍历
        hm.forEach((s,i)-> System.out.println(s+"="+i));
    }
}
