package heying.service.impl;

import entity.UserCourseOrder;
import heying.service.OrderService;
import mapper.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void addOrder(UserCourseOrder uco) {

        uco.setOrderNo(UUID.randomUUID().toString());
        uco.setStatus("0");
        uco.setIsDel("1");
        uco.setCreateTime(new Date());
        uco.setUpdateTime(new Date());

        orderDao.addOrder(uco);
    }

    @Override
    public int updateOrder(String orderNo, int status) {

        Date updateTime = new Date();
        return orderDao.updateOrder(orderNo, status, updateTime);

    }

    @Override
    public int deleteOrder(String orderNo) {

        return orderDao.deleteOrder(orderNo);
    }

    @Override
    public List<UserCourseOrder> findOrder(int userId) {

        return orderDao.findOrder(userId);
    }
}
