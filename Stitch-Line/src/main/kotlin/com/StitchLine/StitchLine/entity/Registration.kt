package com.StitchLine.StitchLine.entity

import lombok.Getter
import lombok.Setter
import lombok.ToString
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Id

@Getter
@Setter
@ToString
@Document(collection = "Registration")
class Registration(
        @Id
         val userName:String,
         val role:String,
         val email:String,
         val name:String,
         val mobile:Int,
         val password:String,
         val nic:String,
         val empNum:String,
         val address:String,
)
