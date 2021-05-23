package com.example.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GatewayKotlinDslApplication

fun main(args: Array<String>) {
	runApplication<GatewayKotlinDslApplication>(*args)
}
