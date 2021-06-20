package com.shiccah.cachesandbox

import com.shiccah.cachesandbox.redis.dto.EntityDto
import com.shiccah.cachesandbox.redis.service.EntityService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val entityService: EntityService) {

    @GetMapping("/put")
    fun put(@RequestParam name: String) {
        entityService.put(name)
    }

    @GetMapping("/getAll")
    fun getAll(): List<EntityDto> {
        return entityService.getAll()
    }
}