package HashMapDemo_20;

import java.util.*;

/*
某个班级80名学生，现在需要组成秋游活动，
班长提供了四个景点依次是(A、 B、C、D) ,
每个学生只能选择一个景点， 请统计出最终哪个景点想去的人数最多。
*/
public class HashMapDemo02 {
    public static void main(String[] args) {
        //需要先投票
        String[] arr={"A","B","C","D"};
        ArrayList<String> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //2.如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义map集合，利用集合进行统计。
        HashMap<String,Integer> hm=new HashMap<>();
        for (String name : list) {
            if(hm.containsKey(name)){
                int count = hm.get(name);
                count++;
                hm.put(name,count);
            }else {
                hm.put(name,1);
            }
        }

        //求最大值
        int max=0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int value = entry.getValue();
            if(value>max){
                max=value;
            }
        }
        for (Map.Entry<String, Integer> entry : entries) {
            int value=entry.getValue();
            if(value==max){
                System.out.println(entry.getKey());
            }
        }
    }
}
