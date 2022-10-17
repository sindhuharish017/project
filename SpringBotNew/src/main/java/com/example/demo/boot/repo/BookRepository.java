package com.example.demo.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.boot.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
//	List<Book> findbyId(int id);
	
}
