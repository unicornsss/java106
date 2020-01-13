package test;

import java.util.*;

public class LIsttest {
    public static void main(String[] args) {
        Stu stu1 = new Stu(1,"aaa");
        Stu stu2 = new Stu(2,"bbb");
        Stu stu3 = new Stu(3,"aaa");
        Stu stu4 = new Stu(4,"aaa");
        Stu stu5 = new Stu(5,"ddd");
        List<Stu> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        TestPeople people1 = new TestPeople(111,list);

        Stu stu11 = new Stu(11,"aaa");
        Stu stu22 = new Stu(21,"bbb");
        Stu stu33 = new Stu(31,"aaa");
        Stu stu44 = new Stu(41,"aaa");
        Stu stu55 = new Stu(51,"ddd");
        List<Stu> list1 = new ArrayList<>();
        list1.add(stu11);
        list1.add(stu22);
        list1.add(stu33);
        list1.add(stu44);
        list1.add(stu55);
        TestPeople people2 = new TestPeople(222,list1);

        Map<Integer,TestPeople> map = new HashMap<>();
        map.put(123,people1);
        map.put(124,people2);
        for (Integer integer : map.keySet()) {
            System.out.println(map.get(integer));
            System.out.println("\n");
        }

        Map<Integer,TestPeople> map2 = getmap(map);

        for (Integer integer : map2.keySet()) {
            System.out.println(map2.get(integer));
            System.out.println("\n");
        }
    }

    public static Map<Integer,TestPeople> getmap(Map<Integer,TestPeople> map) {
        for (Integer integer : map.keySet()) {
            TestPeople people = map.get(integer);
            if (integer == 123) {
                System.out.println(123+"=======");
                remove(people,"bbb");
            }
            if (integer == 124){
                System.out.println(124+"=======");
                remove(people,"ddd");
            }
        }
        return map;
//        Map<Integer,TestPeople> map2 = change(map);
    }

    public static Map<Integer,TestPeople> change(Map<Integer,TestPeople> map){
        for (Integer integer : map.keySet()) {
            if (integer == 123) {
                System.out.println(123+"=======");
                remove(map.get(integer),"bbb");
            }
            if (integer == 124){
                System.out.println(124+"=======");
                remove(map.get(integer),"ddd");
            }
        }
        return map;
    }
    public static void remove (TestPeople people,String name){
        Iterator<Stu> stuIterator = people.getStuList().iterator();
        while (stuIterator.hasNext()) {
            Stu stu = stuIterator.next();
            if (stu.getNames().equals(name)){
                System.out.println();
                stuIterator.remove();
            }
        }
    }
}
