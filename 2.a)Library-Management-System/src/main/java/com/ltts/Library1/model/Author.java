package com.ltts.Library1.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user1")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 100,unique = true)
	private String name;

	@Column(name = "description", length = 250, unique = true)
	private String description;


	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE , CascadeType.REMOVE}, mappedBy = "authors")
	private Set<Book> books = new HashSet<Book>();

	
	public Author(Long id, String name, String description, String email, String password, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		
		this.books = books;
	}

	public Author() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", description=" + description + ",  books=" + books + "]";
	}

	

	

}
