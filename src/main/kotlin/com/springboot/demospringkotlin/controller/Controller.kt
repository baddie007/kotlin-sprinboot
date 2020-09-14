package com.springboot.demospringkotlin.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
open class Controller {
    @RequestMapping("/hello")
    fun myFun(): String{
        return "Hello, How are you doing?"
    }
}