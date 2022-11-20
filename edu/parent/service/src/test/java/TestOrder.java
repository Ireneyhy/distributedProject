import entity.UserCourseOrder;
import heying.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class TestOrder {

    @Autowired
    private OrderService orderService;

    @Test
    public void addOrder(){

        UserCourseOrder userCourseOrder = new UserCourseOrder();

        orderService.addOrder(userCourseOrder);
    }
}
