package io.mart.sut.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import io.mart.sut.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

	private Map<Long, Book> books = new HashMap<>();

	public Optional<Book> findById(long id) {
		return Optional.ofNullable(books.get(id));
	}

	public void add(Book book) {
		books.put(book.getId(), book);
	}

	public Collection<Book> getBooks() {
		return books.values();
	}
	
	public Book update(Long id, Book book) {
		return books.computeIfPresent(id, (aLong, bookToUpdate) -> {
			bookToUpdate.setAuthor(book.getAuthor());
			bookToUpdate.setTitle(book.getTitle());
			return bookToUpdate;
		});
	}
	
	public void delete(Long id) {
		books.remove(id);
	}
}
