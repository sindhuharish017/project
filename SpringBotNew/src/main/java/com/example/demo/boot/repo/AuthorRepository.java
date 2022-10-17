package com.example.demo.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.boot.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
