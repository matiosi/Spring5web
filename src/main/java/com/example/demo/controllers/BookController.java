package com.example.demo.controllers;

import com.example.demo.model.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mateusz.osiak on 9/19/2017.
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books",bookRepository.findAll());
        return "books";
    }
}
