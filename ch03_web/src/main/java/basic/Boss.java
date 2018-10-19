package basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Boss implements WorkManager {
    @Override
    public String doIt() {
        return "do boss";
    }

    @PostConstruct
    public void onCreated() {
        System.out.println("boss created!!");
    }

    @PreDestroy
    public void onDestroyed() {
        System.out.println("boss destroyed!!");
    }
}
