package com.tcs.authorService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	public Author save(Author author) {
		return authorRepository.save(author);
	}

	public Optional<Author> findById(Long id) {
		return authorRepository.findById(id);
	}
}
