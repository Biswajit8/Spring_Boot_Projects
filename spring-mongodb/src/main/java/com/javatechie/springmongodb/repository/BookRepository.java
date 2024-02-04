package com.javatechie.springmongodb.repository;

import com.javatechie.springmongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
