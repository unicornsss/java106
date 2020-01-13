package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangshushan
 * @Date: 2020-01-06 15:10
 */
public class test {
    public static void main(String[] args) {
//        List<GetRatePlanByHotelPreFilter> getRatePlanByHotelPreFilters = new;
//        List<GetRatePlanByHotelPostFilter> getRatePlanByHotelPostFilters = null;
        GetRatePlanByHotelPreFilter getRatePlanByHotelPreFilters = new GetRatePlanByHotelPreFilterImpl();
        GetRatePlanByHotelPostFilter getRatePlanByHotelPostFilters = new GetRatePlanByHotelPostFilterImpl();
//        List<GetRatePlanByHotelPostFilter> getRatePlanByHotelPostFilters = new ArrayList<>();
        List list001 = new ArrayList();
        list001.add(getRatePlanByHotelPreFilters);
        List<GetRatePlanByHotelPostFilter> list002 = new ArrayList();
        list002.add(getRatePlanByHotelPostFilters);

//        List list = new ArrayList();
//        list.add("1111");
        List list2 = new ArrayList();
        list2.add("2222");

        List<GetRatePlanByHotelPostFilter> getRatePlanByHotelPost = null;
        FilterUtil.executeFilterChain(getRatePlanByHotelPost, list2);

//        FilterUtil.executeFilterChain(list001, list);
        FilterUtil.executeFilterChain(list002, list2);

    }
}
