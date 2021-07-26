package com.StitchLine.StitchLine.dto

import lombok.Getter
import lombok.Setter
import lombok.ToString
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Id
@Getter
@Setter
@ToString
class BookDto (
        internal val id: Int,
        internal val bookName:String,
        internal val authName:String,
)
