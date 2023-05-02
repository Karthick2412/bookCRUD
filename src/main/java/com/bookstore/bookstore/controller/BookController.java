package com.bookstore.bookstore.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.bookstore.common.APIResponse;
import com.bookstore.bookstore.dto.book.CreateBookRequest;
import com.bookstore.bookstore.dto.book.UpdateBookRequest;
import com.bookstore.bookstore.service.impl.BookServiceImpl;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookServiceImpl bookService;
	
	@PostMapping("new")
	public APIResponse newBook(@RequestBody CreateBookRequest newBook) {
		return bookService.addBook(newBook);
	}
	
	@GetMapping("findall")
	public APIResponse findAllBooks() {
		return bookService.findAllBooks();
	}
	
	@GetMapping("{id}")
	public APIResponse findBookById(@PathVariable("id") UUID bookId) {
		return bookService.findBookById(bookId);
	}
	
	@PutMapping("update")
	public APIResponse updateBook(@RequestBody UpdateBookRequest updateBookReq) {
		return bookService.updateBook(updateBookReq);
	}
	
	@DeleteMapping("delete/{id}")
	public APIResponse deleteBookById(@PathVariable("id") UUID bookId) {
		return bookService.deleteBook(bookId);
	}
}
