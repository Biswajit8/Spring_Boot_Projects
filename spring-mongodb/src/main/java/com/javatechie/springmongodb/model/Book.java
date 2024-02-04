package com.javatechie.springmongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Book") // this annotation is used for supporting key value pair
public class Book {

    @Id
    private int id; // if we don't pass id from runtime, id will be autogenerated with string value
    private String bookName;
    private String authorName;
}
