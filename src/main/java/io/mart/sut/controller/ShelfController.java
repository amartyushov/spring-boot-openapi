package io.mart.sut.controller;

import java.util.Collection;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.mart.sut.model.Book;
import io.mart.sut.model.Shelf;
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
@RequestMapping("/api/shelf")
public class ShelfController {
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Shelf postBook(@NotNull @Valid @RequestBody final Shelf shelf) {
		return shelf;
	}
	
}
