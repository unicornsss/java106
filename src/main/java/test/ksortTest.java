package test;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * @Author: yangshushan
 * @Date: 2020-01-06 17:49
 */
public class ksortTest {
    public static void main(String[] args) {
//        testsort();
        testlistRemove();
    }

    public static void testlistRemove() {
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            if(str.equals("222")){
                iterator.remove();
            }
        }
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void testsort() {
        //        Map<String,String> map = new HashMap<String, String>();
        Map<String,String> map = new TreeMap<String, String>();
//        $otaId="11112";
//        $otaHotelId="22123";
//        $checkIn="212";
//        $checkOut="121";
//        map.put("otaId","111");
//        map.put("idid","555");
//        map.put("otaHotelId","222");
//        map.put("checkIn","333");
//        map.put("checkOut","444");
        map.put("Peter","35");
        map.put("Ben","37");
        map.put("Joe","43");

        Map<String,String> map2 = map;
//        Map<String,String> map2 = sortMapByKey(map);
        for (String s : map2.keySet()) {
            System.out.println(s);
        }

        for (String value : map2.values()) {
            System.out.println(value);
        }
        String str = StringUtils.join(map2.values(),":");
        System.out.println(str);
//        array_values

        HashMap<String,Boolean> isUseCaches = new HashMap<>();
    }

    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, String> sortMap = new TreeMap<String, String>(new Comparator<String>() {
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);//将str1和str2调换位置是倒序排序
            }
        });
        sortMap.putAll(map);
        return sortMap;
    }
}
