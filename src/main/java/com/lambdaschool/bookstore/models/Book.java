package com.lambdaschool.bookstore.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id")
  private long id;

  @Column(name = "book_title")
  private String title;

  private String isbn;

  private int copy;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "section_id")
  @JsonIgnoreProperties("books")
  private Section section;

  public Book() {}
}
