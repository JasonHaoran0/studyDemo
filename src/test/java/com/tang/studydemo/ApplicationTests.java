package com.tang.studydemo;

import com.tang.studydemo.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    Logger log = LoggerFactory.getLogger(ApplicationTests.class);
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void resisTest() {
        String n = redisUtil.set("abc", "abc-value", 1);
        System.out.println("redis保存" + n);
    }

    @Test
    public void getRedis() {
        String value = redisUtil.get("abc", 1);
        System.out.println("redis保存" + value);
    }



}
