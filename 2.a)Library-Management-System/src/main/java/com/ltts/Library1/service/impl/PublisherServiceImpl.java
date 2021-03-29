package com.ltts.Library1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ltts.Library1.exception.NotFoundException;
import com.ltts.Library1.model.Publisher;
import com.ltts.Library1.repository.PublisherRepository;
import com.ltts.Library1.service.PublisherService;

@Service
public class PublisherServiceImpl implements PublisherService {

	private final PublisherRepository publisherRepository;

	public PublisherServiceImpl(PublisherRepository publisherRepository) {
		this.publisherRepository = publisherRepository;
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Publisher> findAllPublishers() {
		return publisherRepository.findAll();
	}

	@Override
	public Publisher findPublisherById(Long id) {
		return publisherRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Publisher not found  with ID %d", id)));
	}

	@Override
	public void createPublisher(Publisher publisher) {
		publisherRepository.save(publisher);
	}

	@Override
	public void updatePublisher(Publisher publisher) {
		publisherRepository.save(publisher);
	}

	@Override
	public void deletePublisher(Long id) {
		final Publisher publisher = publisherRepository.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("Publisher not found  with ID %d", id)));

		publisherRepository.deleteById(publisher.getId());
	}

}
