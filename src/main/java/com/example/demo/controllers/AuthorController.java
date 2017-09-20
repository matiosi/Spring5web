package com.example.demo.controllers;

import com.example.demo.model.repositories.AuthorRepository;
import com.example.demo.model.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mateusz.osiak on 9/20/2017.
 */
@Controller
public class AuthorController {


    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors",authorRepository.findAll());
        return "authors";
    }
}
