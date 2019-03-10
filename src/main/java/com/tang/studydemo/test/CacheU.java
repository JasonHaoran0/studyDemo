package com.tang.studydemo.test;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheU {
    @Cacheable(value = "cacheValue", key = "#n")
    public String cacheTest(Integer n) {
        return "缓存的value是：" + n;

    }
}
