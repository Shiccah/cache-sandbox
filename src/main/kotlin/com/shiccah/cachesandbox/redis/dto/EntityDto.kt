package com.shiccah.cachesandbox.redis.dto

import com.shiccah.cachesandbox.redis.model.Entity

data class EntityDto(val id: String, val name: String, val age: Int)

fun Entity.toEntityDto(): EntityDto {
    return EntityDto(id = id,  name = name, age = age )
}