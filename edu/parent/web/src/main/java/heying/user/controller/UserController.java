package heying.user.controller;

import entity.User;
import entity.UserDTO;
import heying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("eduService")
    private UserService userService;

    @GetMapping("login")
    public UserDTO<User> login(String phone, String password){
        UserDTO<User> dto = new UserDTO<>();
        User user;
        System.out.println(phone);
        System.out.println(password);

        Integer i = userService.checkPhone(phone);
        if (i == 0){
            userService.register(phone, password);
            dto.setMessage("Registered by phone number. Please remember the password.");
            user = userService.login(phone, password);
        } else {
            user = userService.login(phone, password);
            if (user == null){
                dto.setState(300);
                dto.setMessage("Credentials are wrong.");
            } else {
                dto.setState(200);
                dto.setMessage("Login successful!");
            }
        }
        dto.setContent(user);
        return dto;
    }
}
