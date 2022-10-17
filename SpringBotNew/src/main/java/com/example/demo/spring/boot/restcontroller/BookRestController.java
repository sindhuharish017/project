package com.example.demo.spring.boot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.boot.entity.Book;
import com.example.demo.boot.service.BookService;


public class BookRestController {

	@Autowired
	private BookService bookService;
	
	@PutMapping("/api/books/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable("id") int id){
		book.setId(id);
		bookService.updateBook(book);
		return bookService.getBook(id);
	}
	@PostMapping("/api/books")
	public Book createBook(@RequestBody Book book){
		return bookService.createBook(book);
	}
	@GetMapping("/api/books")
	public List<Book> getBooks(){
		return bookService.getAll();
	}
	
	@GetMapping("/api/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBook(id);
		
	}
}
