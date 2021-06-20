package com.shiccah.cachesandbox.redis.service

import com.shiccah.cachesandbox.redis.dto.EntityDto
import com.shiccah.cachesandbox.redis.dto.toEntityDto
import com.shiccah.cachesandbox.redis.model.Entity
import com.shiccah.cachesandbox.redis.repository.EntityRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random

@Service
class EntityService(private val entityRepository: EntityRepository) {

    fun put(entityName: String) {
        entityRepository.save(Entity(UUID.randomUUID().toString(), entityName, Random.nextInt()))
    }

    fun getAll(): List<EntityDto> {
        return entityRepository.findAll().map { it!!.toEntityDto() }
    }
}
