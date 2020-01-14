package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class removeTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        //过滤的写法
//        List<RatePlan> ratePlans =ratePlanMockDTO.getRatePlans();
//        List<RatePlan> unavailRatePlans = ratePlans.stream().filter(ratePlan -> {
//            String value = transformToUnavailableOtaRatePlan(ratePlan);
//            return unavailableSet.contains(value);
//        }).collect(Collectors.toList());
//        ratePlans.removeAll(unavailRatePlans);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if(i == 22){
                iterator.remove();
            }
        }

        for (Object o : list) {
            list.remove(o);
        }

    }
}
