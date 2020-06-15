package com.zle;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisplusApplicationTests {


    @Autowired
    SqlSessionFactory factory;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;



    @Test
    public void redisTest() {

        redisTemplate.opsForValue().set("aaa",String.valueOf(System.currentTimeMillis()));
    }

}

