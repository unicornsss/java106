//package test;
//
//import com.alibaba.fastjson.JSON;
//import com.mfw.hotel.baseprice.client.bean.RatePlanMockDTO;
//import com.mfw.hotel.baseprice.client.bean.rateplan.RatePlan;
//import com.mfw.hotel.baseprice.server.ApplicationTests;
//import com.mfw.hotel.baseprice.server.model.param.RatePlanParam;
//import com.mfw.hotel.baseprice.server.util.RedisHelper;
//import org.assertj.core.util.Lists;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.annotation.Resource;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//class UnavailableOtaRatePlanFilterTest extends ApplicationTests {
//
//    @Autowired
//    private UnavailableOtaRatePlanFilter unavailableOtaRatePlanFilter;
//
//    @Resource
//    private RedisHelper redisHelper;
//
//    @Test
//    void insertRedis() {
//        String value = JSON.toJSONString(Lists.newArrayList("122@#@12121"));
//        redisHelper.setObject("mfw:hotelDynamic:ota:unavailRatePlans:2020-01-13:2020-01-14:25900:29",value,60 * 15,TimeUnit.SECONDS);
//    }
//
//    @Test
//    void executeNull() {
//        //list RatePlanMockDTO param
//        List list = new ArrayList();
//        unavailableOtaRatePlanFilter.execute(list);
//    }
//
//    @Test
//    void executeHit() {
//        //list RatePlanMockDTO param
//        RatePlan ratePlan = new RatePlan();
//        ratePlan.setId("12121");
//        ratePlan.setRoomTypeId("122");
//        List list = Lists.newArrayList(ratePlan);
//        RatePlanMockDTO ratePlanMockDTO = new RatePlanMockDTO();
//        ratePlanMockDTO.setRatePlans(list);
//        ratePlanMockDTO.setOtaId(29);
//        ratePlanMockDTO.setOtaHotelId("25900");
//        RatePlanParam ratePlanParam = new RatePlanParam();
//        ratePlanParam.setCheckInDate(LocalDate.now().minusDays(1));
//        ratePlanParam.setCheckOutDate(LocalDate.now());
//        List<RatePlan> ratePlan2 = unavailableOtaRatePlanFilter.execute(list, ratePlanMockDTO, ratePlanParam);
//        Assert.assertEquals(new ArrayList<>(),ratePlan2);
//    }
//
//    @Test
//    void executeNotHit() {
//        RatePlan ratePlan = new RatePlan();
//        ratePlan.setId("13333");
//        ratePlan.setRoomTypeId("122");
//        List list = Lists.newArrayList(ratePlan);
//        RatePlanMockDTO ratePlanMockDTO = new RatePlanMockDTO();
//        ratePlanMockDTO.setRatePlans(list);
//        ratePlanMockDTO.setOtaId(29);
//        ratePlanMockDTO.setOtaHotelId("25900");
//        RatePlanParam ratePlanParam = new RatePlanParam();
//        ratePlanParam.setCheckInDate(LocalDate.now().minusDays(1));
//        ratePlanParam.setCheckOutDate(LocalDate.now());
//        List<RatePlan> ratePlans = unavailableOtaRatePlanFilter.execute(list, ratePlanMockDTO, ratePlanParam);
//        Assert.assertEquals(list,ratePlans);
//    }
//}