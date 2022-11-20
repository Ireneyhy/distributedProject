package mapper;

import entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDao {

    User login(@Param("phone") String phone, @Param("password") String password);
    Integer checkPhone(String phone);

    Integer register(@Param("phone") String phone, @Param("password") String password);
}

