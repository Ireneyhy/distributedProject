package heying.service.impl;

import entity.UserCourseOrder;
import heying.service.OrderService;
import mapper.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
}
