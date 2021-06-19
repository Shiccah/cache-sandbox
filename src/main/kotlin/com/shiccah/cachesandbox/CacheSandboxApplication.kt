package com.shiccah.cachesandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CacheSandboxApplication

fun main(args: Array<String>) {
	runApplication<CacheSandboxApplication>(*args)
}
