package com.oatmeal.apitesting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiTestingApplication

fun main(args: Array<String>) {
	runApplication<ApiTestingApplication>(*args)
}
