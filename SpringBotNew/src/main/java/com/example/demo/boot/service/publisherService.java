package com.example.demo.boot.service;

import java.util.List;

import com.example.demo.boot.entity.Publisher;





public interface publisherService {
	Publisher createPublisher(Publisher publisher);

	Publisher updatePublisher(Publisher publisher);

	List<Publisher> getAll();



}