package com.shinyay.basics.springboot.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class MainController {
    @RequestMapping
    fun index(model: Model): String {
        val fizzbuzz = com.shinyay.basics.springboot.model.fizzBuzzLambda(50)
        model.addAttribute("message", fizzbuzz)
        return "index"
    }
}