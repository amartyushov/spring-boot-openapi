package io.mart.sut.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Book {

	private long id;

	@NotBlank
	@Size(min = 0, max = 20)
	private String title;

	@NotBlank
	@Size(min = 0, max = 30)
	private String author;
	
	private Integer pageNumber;
	
	private Integer year;
	
	
	public Integer getYear() {
		return year;
	}
	
	
	public Book setYear(Integer year) {
		this.year = year;
		return this;
	}
	
	
	public Integer getPageNumber() {
		return pageNumber;
	}
	
	
	public Book setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		return this;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
