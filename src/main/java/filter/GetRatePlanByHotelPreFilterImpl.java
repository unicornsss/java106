package filter;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangshushan
 * @Date: 2020-01-06 11:29
 */
public class GetRatePlanByHotelPreFilterImpl implements GetRatePlanByHotelPreFilter {
    @Override
    public List execute(List listToFilter) {
        List list = new ArrayList();
        list.add("GetRatePlanByHotelPreFilterImpl11111");
        System.out.println("GetRatePlanByHotelPreFilterImpl11111");
        return list;
    }

//
//    @Override
//    public RatePlanDto roomListFilter(OtaRatePlanParam param) {
//
//        return null;
//    }
}
