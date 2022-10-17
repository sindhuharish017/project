package com.example.demo.boot.service;

import java.util.List;

import com.example.demo.boot.entity.Book;

public interface BookService {
	Book createBook(Book book);

	Book updateBook(Book car);

	List<Book> getAll();
//
	Book getBook(int id);
//
//	Book getAllBooks();

//	Book getAllBook(int id);
}
