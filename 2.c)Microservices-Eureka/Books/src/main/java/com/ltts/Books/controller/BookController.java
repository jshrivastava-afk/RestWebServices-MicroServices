package com.ltts.Books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Books.dao.BookDao;
import com.ltts.Books.model.Books;

@RestController
public class BookController {
   @Autowired
   BookDao td;
   
//	@RequestMapping("/teams")
	@GetMapping("/books")
	public List<Books> getBooks()
	{
		return td.getAllBooks();
	}
}
