package com.tang.studydemo.test;

import com.tang.studydemo.utils.RedisUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class CacheTest {
    @Resource
    CacheU cacheU;
    @Resource
    RedisUtil redisUtil;

    @ResponseBody
    @RequestMapping("/")
    public String cTest(String[] args) {
        redisUtil.set("catch1", "测试", 0);
        cacheU.cacheTest(2);
        return "一缓存";
    }
}
