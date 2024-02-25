package br.inatel.labs.padraosoa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import br.inatel.labs.padraosoa.model.entity.Book;
import br.inatel.labs.padraosoa.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService service;
	
	@GetMapping
	public List<Book> getAllBooks(){
		List<Book> allBooks = service.findAll();
		return allBooks;
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable("id") Long bookId) {
		Optional<Book> opBook = this.service.findById(bookId);
		
		if(opBook.isPresent()) {
			return opBook.get();
		}
		
		//responde ao cliente que nada foi encontrado
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Book postBook(@RequestBody Book book) {
		Book createdBook = this.service.create(book);
		return createdBook;
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void putBook(@RequestBody Book book) {
		 this.service.update(book);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBookBy(@PathVariable("id") Long bookId) {
		Book foundBook = this.getBookById(bookId);
		this.service.delete(foundBook);
	}
}
