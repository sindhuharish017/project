package com.example.demo.boot.service;

import java.util.List;

import com.example.demo.boot.entity.Author;



public interface AuthorService {
	Author createAuthor(Author author);

	Author updateAuthor(Author author);

	List<Author> getAll();

	Author getAuthor(int id);

	Author getAllAuthors();

	Author getAllAuthor(int id);

}