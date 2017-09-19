package com.example.demo.model.repositories;

import com.example.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mateusz.osiak on 9/19/2017.
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}
