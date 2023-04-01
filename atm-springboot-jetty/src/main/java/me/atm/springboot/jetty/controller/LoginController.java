package me.atm.springboot.jetty.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class LoginController {
    @GetMapping("/login")
    public String login(Integer time) {
        try {
            int randomTime = new Random().nextInt(time);
            log.info(Thread.currentThread().getName() + " 睡眠[" + randomTime + "]ms");
            TimeUnit.MILLISECONDS.sleep(randomTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(Thread.currentThread().getName() + " 处理完成");
        return "成功";
    }
}
