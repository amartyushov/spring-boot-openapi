package io.mart.sut.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

	private long id;

	@NotBlank
	@Size(min = 0, max = 20)
	private String name;

	@NotBlank
	@Size(min = 0, max = 30)
	private String address;
	
	private Integer age;
	
	
	public long getId() {
		return id;
	}
	
	
	public User setId(long id) {
		this.id = id;
		return this;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public User setName(String name) {
		this.name = name;
		return this;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	
	public User setAddress(String address) {
		this.address = address;
		return this;
	}
	
	
	public Integer getAge() {
		return age;
	}
	
	
	public User setAge(Integer age) {
		this.age = age;
		return this;
	}
}
