package com.example.demo2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class Demo2Application

fun main(args: Array<String>) {
	runApplication<Demo2Application>(*args)
}
