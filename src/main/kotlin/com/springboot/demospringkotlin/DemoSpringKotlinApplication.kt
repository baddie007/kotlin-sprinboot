package com.springboot.demospringkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringKotlinApplication

fun main(args: Array<String>) {
	println("hello start it up")
	runApplication<DemoSpringKotlinApplication>(*args)
}
