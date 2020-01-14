package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * @Author: yangshushan
 * @Date: 2020-01-07 15:50
 */
public class jsontest {
    public static void main(String[] args) {
//        String utime = String.valueOf(LocalDate.now().minusDays(1));
//        System.out.println(utime);
//        System.out.printf(getYesterday());
//        String str = "http://example.com/some/cool/可以page";
//        String json = JSON.toJSONString(str);
//        String res = JSON.parseObject(json,String.class);
//        System.out.println(json);
        HashSet hashSet = new HashSet(JSON.parseArray("[1,2,3]",String.class));
        hashSet.add(null);
        System.out.println(hashSet.size());
        HashSet set = new HashSet();
        System.out.println(set.isEmpty());
//        System.out.println(JSON.parseArray(null,String.class));
//        for (Object o : hashSet) {
//            System.out.println(o);
//        }
    }

    public static String getYesterday() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
//        calendar.getTime();
//        System.out.println("*********"+df.format(calendar.getTime()));
        return df.format(calendar.getTime());
    }

    public static void testJson() {
        List<String> list = new ArrayList<>();
        list.add("12121@#@www11111");
        list.add("12222@#@www11111");
        list.add("123@#@www11111");
        String str = JSON.toJSONString(list); // List转json
        System.out.println(str);
        String json = ""; //获取的Json数据
//        List<String> students = JSON.parseObject(json,new TypeReference<List<String>>(){}); // Json 转List
//        Json 转List方法二
        List<String> res = JSON.parseArray(str,String.class);
        for (String re : res) {
            System.out.println(re);
        }
    }
}
