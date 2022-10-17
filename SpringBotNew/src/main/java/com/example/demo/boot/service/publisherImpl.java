package com.example.demo.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.boot.entity.Publisher;
import com.example.demo.boot.repo.PublisherRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class publisherImpl implements publisherService {
	
	private PublisherRepository publisherRepository;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Publisher createPublisher(Publisher publisher) {
		// TODO Auto-generated method stub
		return publisherRepository.save(publisher);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)

	public Publisher updatePublisher(Publisher publisher) {
		// TODO Auto-generated method stub
		return publisherRepository.save(publisher);
	}

	@Override
	

	public List<Publisher> getAll() {
		// TODO Auto-generated method stub
		return publisherRepository.findAll();
	}

	
}
