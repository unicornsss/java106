package test;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: yangshushan
 * @Date: 2020-01-08 09:16
 */
public class serializedTest {
    public static void main(String[] args) {
        Stu stu = new Stu(12,"sss");
        List list = Lists.newArrayList(stu);
        list.add(new Person(11,22));

        for (Object o : list) {
            if( o instanceof Stu){
                System.out.println(((Stu) o).getNames());
            }else{
                System.out.println(((Person) o).getAge());
            }
            System.out.println(o);
        }
    }
}
