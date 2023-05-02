package com.bookstore.bookstore.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_book")
public class Book {
	
	@Id
	@Column(columnDefinition = "Binary(16)")
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private UUID bookId;
	
	@Column(name="book_name", columnDefinition = "VARCHAR(50)")
	private String bookName;
	
	@Column(name="author_name", columnDefinition = "VARCHAR(30)")
	private String authorName;
	
	@Column(name="booksCount")
	private int booksCount;
	
	public Book(UUID bookId, String bookName, String authorName, int booksCount) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.booksCount = booksCount;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID getBookId() {
		return bookId;
	}

	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBooksCount() {
		return booksCount;
	}

	public void setBooksCount(int booksCount) {
		this.booksCount = booksCount;
	}


	
	

}
