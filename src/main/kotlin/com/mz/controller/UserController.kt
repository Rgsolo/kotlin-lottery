package com.mz.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * @Description：
 * @author mz
 * @date 2018/6/28
 * @time 10:21
 */
@Controller
@RequestMapping("/user")
class UserController {
    @GetMapping("/loginUI")
    fun loginUI():String {
        return "login"
    }

    @GetMapping("/registerUI")
    fun registerUI() : String {
        return "register"
    }
}