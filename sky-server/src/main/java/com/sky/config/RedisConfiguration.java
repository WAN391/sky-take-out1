package com.sky.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@Slf4j
public class RedisConfiguration {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        log.info("开始创建 RedisTemplate 对象...");

        //创建 Redis的连接工厂对象
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        //设置Redis key的序列化器
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        log.info("创建 RedisTemplate 对象成功！");
        return redisTemplate;
    }
}
