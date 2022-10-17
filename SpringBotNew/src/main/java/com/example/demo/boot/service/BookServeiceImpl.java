package com.example.demo.boot.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.boot.entity.Book;
import com.example.demo.boot.repo.BookRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class BookServeiceImpl implements BookService {

	@Autowired
	private  BookRepository  bookRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return bookRepository.getReferenceById(id);
		
	}

	
}
