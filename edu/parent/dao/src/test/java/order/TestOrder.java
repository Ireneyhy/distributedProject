package order;

import com.alibaba.fastjson2.util.UUIDUtils;
import entity.UserCourseOrder;
import mapper.OrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TestOrder {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void addOrder(){

        UserCourseOrder uco = new UserCourseOrder();

        uco.setOrderNo(UUID.randomUUID().toString());
        uco.setCourseId(14);
        uco.setStatus("0");
        uco.setUserId(100030019);
        uco.setIsDel("1");
        uco.setCreateTime(new Date());
        uco.setUpdateTime(new Date());
        uco.setActivityCourseId(10);
        uco.setSourceType("0");

        orderDao.addOrder(uco);
    }
}
