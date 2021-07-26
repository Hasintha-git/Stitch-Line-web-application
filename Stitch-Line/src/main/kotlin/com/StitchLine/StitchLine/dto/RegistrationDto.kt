package com.StitchLine.StitchLine.dto

import lombok.Getter
import lombok.Setter
import lombok.ToString

@Getter
@Setter
@ToString
class RegistrationDto (
        internal val userName:String,
        internal val role:String,
        internal val email:String,
        internal val name:String,
        internal val mobile:Int,
        internal val password:String,
        internal val nic:String,
        internal val empNum:String,
        internal val address:String,
)
