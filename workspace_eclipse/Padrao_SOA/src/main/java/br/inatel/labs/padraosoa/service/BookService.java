package br.inatel.labs.padraosoa.service;
import br.inatel.labs.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	private List<Book> bookList = new ArrayList<>();
	
	public List<Book> findAll(){
		return this.bookList;
	}
	
	@PostConstruct
	private void setup() {
		Book b1 = new Book(1L, "Delphin Blanco", "Contos");
		Book b2 = new Book(2L, "Python com Matemática","Programação");
		Book b3 = new Book(3L, "Cozinha Mineira", "Gatronomia");
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}
	
	public Optional<Book> findById(Long id){
		return this.bookList.stream()
				.filter(b -> b.getId().equals(id))
				.findFirst();
	}
	
	public Book create(Book book) {
		Long id = new Random().nextLong();
		book.setId(id);
		this.bookList.add(book);
		return book;
	}
	
	public void update(Book book) {
		this.bookList.remove(book);
		this.bookList.add(book);
	}
	
	public void delete(Book book) {
		this.bookList.remove(book);
	}

	
}
