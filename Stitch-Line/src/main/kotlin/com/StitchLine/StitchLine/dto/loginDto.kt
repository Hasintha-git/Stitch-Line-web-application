package com.StitchLine.StitchLine.dto

import lombok.Getter
import lombok.Setter
import lombok.ToString

@Getter
@Setter
@ToString
class loginDto (
        internal val userName:String,
        internal val role:String,
        internal val password:String,
)
