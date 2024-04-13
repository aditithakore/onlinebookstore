package com.onlinebook.store.entity;

import jakarta.persistence.*;

@Entity
public class Wishlists {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Users user;

	@ManyToOne
	private Books book;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	// Constructors

	// Getters and setters

	// Additional methods (if any)
}
