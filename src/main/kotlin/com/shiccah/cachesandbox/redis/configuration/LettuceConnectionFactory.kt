package com.shiccah.cachesandbox.redis.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate


@Configuration
internal class RedisConfiguration {

    @Bean
    fun jedisConnectionFactory(): JedisConnectionFactory? {
        val config = RedisStandaloneConfiguration("localhost", 6379)
        val factory = JedisConnectionFactory(config)
        factory.poolConfig?.minIdle = 10
        factory.poolConfig?.maxIdle = 30
        return factory
    }

    @Bean
    fun redisTemplate(): RedisTemplate<String, Any>? {
        val template = RedisTemplate<String, Any>()
        template.setConnectionFactory(jedisConnectionFactory()!!)
        return template
    }
}