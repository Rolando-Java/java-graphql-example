package com.example.java_graphql_example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.graphql.test.autoconfigure.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(BookController.class)
class BookControllerTest {

  @Autowired
  private GraphQlTester graphQlTester;

  @Test
  void canGetBooks() {
    this.graphQlTester
        .documentName("books")
        .operationName("booksTestOne")
        .execute()
        .path("books")
        .entityList(Book.class)
        .hasSize(4);
  }

}