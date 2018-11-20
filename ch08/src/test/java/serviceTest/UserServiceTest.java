package serviceTest;

import info.thecodinglive.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends ServiceTestConfig {
    @Autowired
    UserService userService;

    @Test
    public void findUserList() {
        userService.findAllUserInfo();
    }

    @Test
    public void findUserNameTest() {
        String uname = "kim1";
        System.out.println(userService.findByOneUserName(uname));
    }
}
