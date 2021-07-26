package com.StitchLine.StitchLine.repository


import com.StitchLine.StitchLine.dto.RegistrationDto
import com.StitchLine.StitchLine.dto.loginDto
import com.StitchLine.StitchLine.entity.Registration
import org.springframework.data.mongodb.repository.MongoRepository


interface RegistrationRepo :MongoRepository<Registration,String>{
    fun findByUserName(userName:String):Registration


}
