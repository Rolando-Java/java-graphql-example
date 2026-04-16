package com.example.java_graphql_example;

import module java.base;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

  @QueryMapping
  public List<Book> books() {
    return Book.books;
  }

  @QueryMapping
  public Optional<Book> bookById(@Argument String id) {
    return Book.getBookById(Integer.parseInt(id));
  }

  @SchemaMapping
  public Optional<Author> author(Book book) {
    return Author.getAuthorById(book.authorId());
  }

}
