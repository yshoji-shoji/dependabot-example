package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

@Suppress("EmptyFunctionBlock")
fun main(args: Array<String>) {
	@Suppress("SpreadOperator")
    runApplication<DemoApplication>(*args)
}
