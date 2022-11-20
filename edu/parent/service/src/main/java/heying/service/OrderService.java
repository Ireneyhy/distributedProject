package heying.service;

import entity.UserCourseOrder;

import java.util.Date;
import java.util.List;

public interface OrderService {

    void addOrder(UserCourseOrder uco);
    int updateOrder(String orderNo, int status);
    int deleteOrder(String orderNo);
    List<UserCourseOrder> findOrder(int userId);
}
