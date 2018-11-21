package info.thecodinglive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NonDbRepository {
    private final long sleepTime = 3000L;
    private final Logger logger = LoggerFactory.getLogger(NonDbRepository.class);

    public Car getByName(String name) {
        makeSlowService();
        Car myCar = new Car(name);
        return randomCarColor(myCar);
    }

    private Car randomCarColor(Car car) {
        Random rn = new Random();
        rn.setSeed(System.currentTimeMillis());

        String colors[] = {"red", "blue", "gray", "white", "purple"};

        for(int i=0; i<5; i++) {
            int b = rn.nextInt(5);
            car.setColor(colors[b]);
        }

        return car;
    }

    private void makeSlowService() {
        logger.info("start sleep");
        try {
            Thread.sleep(sleepTime);
        }catch (InterruptedException ire) {
            throw new IllegalStateException(ire);
        }
        logger.info("end sleep");
    }
}
