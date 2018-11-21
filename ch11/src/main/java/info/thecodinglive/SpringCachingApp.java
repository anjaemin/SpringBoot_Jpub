package info.thecodinglive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCachingApp implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(SpringCachingApp.class);

    @Autowired
    NonDbRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringCachingApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("car information");
        logger.info("no1::" + carRepository.getByName("스팅어"));
        logger.info("no2::" + carRepository.getByName("k5"));
        logger.info("no3::" + carRepository.getByName("BMW"));
        logger.info("no4::" + carRepository.getByName("벤츠"));
        logger.info("no5::" + carRepository.getByName("페라리"));
        // cache 확인을 위해서 한번 더 같은 내용 출력
        logger.info("no1::" + carRepository.getByName("스팅어"));
        logger.info("no1::" + carRepository.getByName("스팅어"));
        logger.info("no2::" + carRepository.getByName("k5"));
    }
}
