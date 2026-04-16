package com.example.java_graphql_example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {
  public static List<Author> authors = Arrays.asList(
      new Author(1, "Mama Samba"),
      new Author(2, "Jamila"),
      new Author(3, "Allah")
  );

  public static Optional<Author> getAuthorById(int id) {
    return Author.authors.stream().filter(a -> a.id.equals(id)).findFirst();
  }
}
