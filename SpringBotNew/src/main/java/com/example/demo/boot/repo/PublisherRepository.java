package com.example.demo.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.boot.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer>{

}
