package com.tcs.authorService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	@GetMapping
	public List<Author> getAllAuthors() {
		return authorService.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Author> getAllAuthors(@PathVariable("id") Long id) {
		return authorService.findById(id);
	}

	@PostMapping
	public Author createAuthor(@RequestBody Author author) {
		return authorService.save(author);
	}
}