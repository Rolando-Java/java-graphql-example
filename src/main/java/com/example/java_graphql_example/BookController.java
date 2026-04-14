package com.example.java_graphql_example;

import module java.base;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

  @QueryMapping
  public List<Book> books() {
    return Book.books;
  }

}
