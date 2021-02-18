package io.mart.sut.controller;

import java.util.Collection;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.mart.sut.exception.BookNotFoundException;
import io.mart.sut.model.Book;
import io.mart.sut.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	
	@GetMapping("/")
	public Collection<Book> findBooks() {
		return repository.getBooks();
	}
	
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Book updateBook(@PathVariable("id") final String id, @RequestBody final Book book) {
		return repository.update(Long.valueOf(id), book);
	}
	
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Book postBook(@NotNull @Valid @RequestBody final Book book) {
		repository.add(book);
		return book;
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public long deleteBook(@PathVariable final long id) {
		repository.delete(id);
		return id;
	}
}
