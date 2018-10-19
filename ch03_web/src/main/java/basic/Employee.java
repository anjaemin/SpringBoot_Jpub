package basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee implements WorkManager {
    @Override
    public String doIt() {
        return "do work";
    }

    @PostConstruct
    public void onCreated() {
        System.out.println("Employee Created!!");
    }

    @PreDestroy
    public void onDestroyed() {
        System.out.println("employee destroyed!!");
    }
}
