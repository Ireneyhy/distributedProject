package mapper;

import entity.UserCourseOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface OrderDao {

    void addOrder(UserCourseOrder uco);
    int updateOrder(@Param("orderNo")String orderNo, @Param("status")int status, @Param("updateTime") Date updateTime);
    int deleteOrder(@Param("orderNo")String orderNo);
    List<UserCourseOrder> findOrder(@Param("userId")int userId);

}
