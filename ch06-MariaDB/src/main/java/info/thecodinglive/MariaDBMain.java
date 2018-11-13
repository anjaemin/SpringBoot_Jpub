package info.thecodinglive;

import info.thecodinglive.model.UserVO;
import info.thecodinglive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
public class MariaDBMain implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MariaDBMain.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userRepository.getUserInfoAll().toString());
        UserVO userEntity = new UserVO("test4", "jpub", "qwer1234");
        userRepository.addUserInfo(userEntity);
        System.out.println("=== 입력후 ===");
        System.out.println(userRepository.getUserInfoAll().toString());

        System.out.println("LIKE 이름 검색");
        System.out.println(userRepository.findByUserNameLike("ki").toString());

        System.out.println("단건조회");
        UserVO userVO = userRepository.findByUserName("jpub");
        System.out.println(userVO.getId() + ", " + userVO.getUsername() + ", " + userVO.getPassword());
    }
}
