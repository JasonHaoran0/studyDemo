package com.tang.studydemo.test;

import com.tang.studydemo.utils.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CacheTest {
    @Resource
    CacheU cacheU;
    @Resource
    RedisUtil redisUtil;

    @RequestMapping("/")
    public String cTest(String[] args) {
        redisUtil.set("catch1", "测试", 0);
        return "一缓存";
    }
}
