package com.shiccah.cachesandbox.redis.repository

import com.shiccah.cachesandbox.redis.model.Entity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface EntityRepository : CrudRepository<Entity?, String?>