package com.StitchLine.StitchLine.controller

import com.StitchLine.StitchLine.dto.RegistrationDto
import com.StitchLine.StitchLine.dto.loginDto
import com.StitchLine.StitchLine.entity.Registration
import com.StitchLine.StitchLine.service.BookService
import com.StitchLine.StitchLine.service.RegistrationsService
import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.web.bind.annotation.*
import javax.xml.ws.Response


@RestController
@CrossOrigin
@RequestMapping("/registration")
class RegistrationController(private val registrationsService: RegistrationsService) {
    @PostMapping("/add")
    fun addRegistration(@RequestBody registrationDto: RegistrationDto):Boolean{
        println(registrationDto.mobile)
        if (registrationDto.userName.length >= 4) {
            val saved=registrationsService.saveRegistration(registrationDto)
            return saved
        }else{
            return false
        }
    }

    @GetMapping( "/login/{userName}")
    fun login(@PathVariable userName:String ):RegistrationDto{
        println("get ekata awa")
        val reg= registrationsService.login(userName)
        return reg;
    }

    @GetMapping( "/no")
    fun no(@RequestParam n:String):Boolean {
        return true
    }
}
