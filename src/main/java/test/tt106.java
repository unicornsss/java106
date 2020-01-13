package test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: yangshushan
 * @Date: 2020-01-06 14:38
 */
public class tt106 {
    public static void main(String[] args) {
        Stu stu = new Stu(1,"1www");
        ArrayList list = new ArrayList(Collections.singleton(stu));
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
