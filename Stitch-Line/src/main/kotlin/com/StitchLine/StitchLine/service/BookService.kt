package com.StitchLine.StitchLine.service

import com.StitchLine.StitchLine.dto.BookDto
import com.StitchLine.StitchLine.entity.Book
import com.StitchLine.StitchLine.repository.BookRepo
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService {
    lateinit var modelMapper: ModelMapper

    @Autowired
    private lateinit var bookRepo: BookRepo


    fun saveBook(bookDto: BookDto):Boolean{
        val book=Book(bookDto.id,bookDto.bookName,bookDto.authName)
        bookRepo.save(book);
        return true;
    }

    fun findBook(b: Int): BookDto {
        val saved=bookRepo.findById(b)
        println(saved.isPresent)
        println(saved.get().bookName)
        val bookDto=BookDto(saved.get().id,saved.get().bookName,saved.get().authName)
        return bookDto
    }


}

