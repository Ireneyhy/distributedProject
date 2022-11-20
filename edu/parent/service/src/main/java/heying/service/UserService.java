package heying.service;

import entity.User;

public interface UserService {

    User login(String phone, String password);

    Integer checkPhone(String phone);

    Integer register(String phone, String password);
}
