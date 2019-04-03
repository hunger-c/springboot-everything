package com.orange;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by Z.C.Hemon on 2019/4/2 16:11.
 */
@Repository
public class RedisUtil {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public void add(String key, Long time, Object object){
        redisTemplate.opsForValue().set(key,JSON.toJSONString(object),time,TimeUnit.MINUTES);
    }

    public Object get(String key){
        String result=redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(result)){
             return JSON.parse(result);
        }
        return null;
    }

    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }
}
