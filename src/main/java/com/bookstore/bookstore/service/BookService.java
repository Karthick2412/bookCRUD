package com.bookstore.bookstore.service;

import java.util.UUID;

import com.bookstore.bookstore.common.APIResponse;
import com.bookstore.bookstore.dto.book.CreateBookRequest;
import com.bookstore.bookstore.dto.book.UpdateBookRequest;

public interface BookService {
	
	public APIResponse addBook(CreateBookRequest newBook);
	
	public APIResponse findAllBooks();
	
	public APIResponse findBookById(UUID bookId);
	
	public APIResponse updateBook(UpdateBookRequest BookUpdateReq);
	
	public APIResponse deleteBook(UUID deleteBook);

}
