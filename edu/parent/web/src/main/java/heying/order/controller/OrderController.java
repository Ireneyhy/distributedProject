package heying.order.controller;

import entity.UserCourseOrder;
import heying.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    @Qualifier("eduOrderService")
    private OrderService orderService;

    @GetMapping("addOrder/{userId}/{courseId}/{activityId}/{stype}")
    public void addOrder(@PathVariable("userId")Integer user_id, @PathVariable("courseId")Integer course_id,@PathVariable("activityId")Integer activity_course_id,@PathVariable("stype")String source_type){

        UserCourseOrder userCourseOrder = new UserCourseOrder();

        userCourseOrder.setUserId(user_id);
        userCourseOrder.setSourceType(source_type);
        userCourseOrder.setCourseId(course_id);
        userCourseOrder.setActivityCourseId(activity_course_id);
        orderService.addOrder(userCourseOrder);
    }

    @GetMapping("updateOrder/{oid}/{status}")
    public int updateOrder(@PathVariable("oid")String orderNo, @PathVariable("status")int status){

        return orderService.updateOrder(orderNo, status);
    }

    @GetMapping("deleteOrder/{oid}")
    public int deleteOrder(@PathVariable("oid")String orderNo){

        return orderService.deleteOrder(orderNo);
    }

    @GetMapping("findOrder/{uid}")
    public List<UserCourseOrder> findOrder(@PathVariable("uid")int userId){

        return orderService.findOrder(userId);
    }
}
