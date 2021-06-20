package com.shiccah.cachesandbox.redis.model

import org.springframework.data.redis.core.RedisHash
import java.io.Serializable

@RedisHash("Entity")
data class Entity(val id: String, val name: String, val age: Int): Serializable

