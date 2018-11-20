package daoTest;

import info.thecodinglive.model.UserVO;
import info.thecodinglive.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends MybatisTestConfig {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testList() {
        System.out.println(userRepository.getUserInfoAll());
    }

    @Test
    public void createUser() {
        UserVO userVO = new UserVO();
        userVO.setId("jpub115");
        userVO.setUserName("hong");
        userVO.setEmail("test1@jpub.com");
        userRepository.addUserInfo(userVO);
        System.out.println(userRepository.getUserInfoAll());
    }
}
