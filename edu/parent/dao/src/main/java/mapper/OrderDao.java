package mapper;

import entity.UserCourseOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface OrderDao {

    void addOrder(UserCourseOrder uco);
}
