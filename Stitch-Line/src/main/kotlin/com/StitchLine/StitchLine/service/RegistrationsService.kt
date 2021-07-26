package com.StitchLine.StitchLine.service

import com.StitchLine.StitchLine.dto.RegistrationDto
import com.StitchLine.StitchLine.dto.loginDto
import com.StitchLine.StitchLine.entity.Registration
import com.StitchLine.StitchLine.repository.RegistrationRepo
import com.sun.el.stream.Optional
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RegistrationsService {
    lateinit var modelMapper: ModelMapper


    @Autowired
    private lateinit var registrationRepo: RegistrationRepo

    fun saveRegistration(r: RegistrationDto):Boolean{

                if (r.role == "customer") {
                    val reg = Registration(r.userName, r.role, r.email, r.name, r.mobile, r.password, r.nic, r.empNum, r.address)
                    registrationRepo.save(reg);
                    return true
                } else if (r.role == "admin") {
                    val admin = Registration(r.userName, r.role, r.email, r.name, r.mobile, r.password, r.nic, r.empNum, r.address)
                    registrationRepo.save(admin)
                    return true
                } else {
                    return false
                }

        }


    fun login(l: String): RegistrationDto {
            println(l)
            println(l)
            val n=registrationRepo.findByUserName(l)
            println(n.email)
            return RegistrationDto(n.userName,n.role,n.email,n.name,n.mobile,n.password,n.nic,n.empNum,n.address)
    }


}
