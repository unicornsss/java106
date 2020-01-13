package filter;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangshushan
 * @Date: 2020-01-06 11:29
 */
public class GetRatePlanByHotelPostFilterImpl implements GetRatePlanByHotelPostFilter {
    @Override
    public List execute(List listToFilter) {
        List list = new ArrayList();
        list.add("GetRatePlanByHotelPostFilterImpl222");
        System.out.println("GetRatePlanByHotelPostFilterImpl222");
        return list;
    }

//
//    @Override
//    public RatePlanDto roomListFilter(OtaRatePlanParam param) {
//
//        return null;
//    }
}
