package com.bookstore.bookstore.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.bookstore.common.APIResponse;
import com.bookstore.bookstore.dto.book.CreateBookRequest;
import com.bookstore.bookstore.dto.book.UpdateBookRequest;
import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.repository.BookRepository;
import com.bookstore.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public APIResponse addBook(CreateBookRequest newBook) {
		
		Book book=new Book();
		book.setBookName(newBook.getBookName());
		book.setAuthorName(newBook.getAuthorName());
		book.setBooksCount(newBook.getNoOfBooks());
		bookRepo.save(book);
		
		APIResponse api=new APIResponse();
		
		api.setData(book);
		api.setMessage("New Book Added");
		api.setMsgCode("NEW_BOOK_ADDED_SUCCESSFULLY");
		api.setStatuscode(200);
		
		return api;
	}

	@Override
	public APIResponse findAllBooks() {
		APIResponse api=new APIResponse();
		api.setData(bookRepo.findAll());
		api.setStatuscode(200);
		api.setMessage("List of books");
		api.setMsgCode("LIST_OF_BOOKS");
		return api;
	}
	
	@Override
	public APIResponse findBookById(UUID bookId) {
		Book book=bookRepo.findById(bookId).orElse(null);
		APIResponse api=new APIResponse();
		if(book!=null) {
			api.setData(book);
			api.setStatuscode(200);
			api.setMessage("Book is present");
			api.setMsgCode("BOOK_IS_PRESENT");
		}else {
			api.setStatuscode(200);
			api.setMessage("There is no Book available on that id");
			api.setMsgCode("BOOK_IS_NOT_PRESENT");
		}
		return api;
	}

	@Override
	public APIResponse updateBook(UpdateBookRequest BookUpdateReq) {
		Book book=bookRepo.findById(BookUpdateReq.getBookId()).orElse(null);
		APIResponse api=new APIResponse();
		if(book!=null) {
			book.setBookName(BookUpdateReq.getBookName());
			book.setAuthorName(BookUpdateReq.getAuthorName());
			book.setBooksCount(BookUpdateReq.getNoOfBooks());
			bookRepo.save(book);
			
			api.setData(book);
			api.setMessage("Book Updated");
			api.setMsgCode("BOOK_UPDATED_SUCCESSFULLY");
			api.setStatuscode(200);
		}else {
			api.setStatuscode(200);
			api.setMessage("No Book available");
			api.setMsgCode("CANNOT_UPDATE");
		}
		return api;
	}

	@Override
	public APIResponse deleteBook(UUID deleteBookId) {
		Book book=bookRepo.findById(deleteBookId).orElse(null);
		APIResponse api=new APIResponse();
		if(book!=null) {
			bookRepo.delete(book);
			api.setStatuscode(200);
			api.setMessage("Book is deleted");
			api.setMsgCode("BOOK_IS_DELETED");
		}else {
			api.setStatuscode(200);
			api.setMessage("There is no Book available on that id");
			api.setMsgCode("BOOK_IS_NOT_DELETED");
		}
		return api;
	}

	

}
