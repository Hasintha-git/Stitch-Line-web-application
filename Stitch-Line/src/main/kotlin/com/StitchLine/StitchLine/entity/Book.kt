package com.StitchLine.StitchLine.entity

import lombok.Getter
import lombok.Setter
import lombok.ToString
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Id

@Getter
@Setter
@ToString
@Document(collection = "Book")
class Book (
        @Id internal val id: Int,
        internal val bookName:String,
        internal val authName:String,
)
