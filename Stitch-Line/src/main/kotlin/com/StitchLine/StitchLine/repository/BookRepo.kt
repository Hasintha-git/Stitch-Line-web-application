package com.StitchLine.StitchLine.repository

import com.StitchLine.StitchLine.entity.Book
import org.springframework.data.mongodb.repository.MongoRepository


interface BookRepo :MongoRepository<Book,Int>{

}
