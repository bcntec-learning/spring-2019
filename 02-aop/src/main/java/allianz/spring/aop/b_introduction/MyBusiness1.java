package allianz.spring.aop.b_introduction;

import org.springframework.stereotype.Component;

import java.util.Random;

public class MyBusiness1 {

    @MyAudit
    public void who(){
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {

        }
    }
}
