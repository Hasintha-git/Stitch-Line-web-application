package com.StitchLine.StitchLine.controller

import com.StitchLine.StitchLine.dto.BookDto
import com.StitchLine.StitchLine.dto.loginDto
import com.StitchLine.StitchLine.entity.Book
import com.StitchLine.StitchLine.repository.BookRepo
import com.StitchLine.StitchLine.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(private val bookService: BookService ){

    @PostMapping("/addBook")
    fun saveBook(@RequestBody bookDto: BookDto):String{
        val saved=bookService.saveBook(bookDto)
        if (saved==true){
            return "success"
        }else{
            return "false"
        }
    }

    @GetMapping("/getBook")
    fun login(@RequestParam id: Int): BookDto {
            val saved=bookService.findBook(id)
            return saved

    }

}
