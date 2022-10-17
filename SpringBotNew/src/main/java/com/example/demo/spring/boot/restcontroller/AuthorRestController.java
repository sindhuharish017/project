package com.example.demo.spring.boot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.boot.entity.Author;
//import com.example.demo.boot.entity.Book;
import com.example.demo.boot.service.AuthorService;
//import com.example.demo.boot.service.BookService;

public class AuthorRestController {

	@Autowired
	private AuthorService authorService;
	
	@PutMapping("/api/authors/{id}")
	public Author updateAuthor(@RequestBody Author author,@PathVariable("id") int id){
		author.setId(id);
		authorService.updateAuthor(author);
		return authorService.getAuthor(id);
	}
	@PostMapping("/api/authors")
	public Author createAuthor(@RequestBody Author author){
		return authorService.createAuthor(author);
	}
	@GetMapping("/api/authors")
	public List<Author> getAuthor(){
		return authorService.getAll();
	}
	
	@GetMapping("/api/authors/{id}")
	public Author getAuthor(@PathVariable("id") int id) {
		return authorService.getAuthor(id);
		
	}
}
