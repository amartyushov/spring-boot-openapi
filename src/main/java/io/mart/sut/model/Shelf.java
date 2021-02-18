package io.mart.sut.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Shelf {

	private long id;

	@NotBlank
	@Size(min = 0, max = 20)
	private String title;
	
	
	public long getId() {
		return id;
	}
	
	
	public Shelf setId(long id) {
		this.id = id;
		return this;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public Shelf setTitle(String title) {
		this.title = title;
		return this;
	}
}
