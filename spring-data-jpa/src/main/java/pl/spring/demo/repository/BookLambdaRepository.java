package pl.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.spring.demo.booksearchcriteria.BookSearchCriteria;
import pl.spring.demo.entity.BookEntity;

import java.util.List;

public interface BookLambdaRepository{

	public List<BookEntity> findAllLibraries();
	public List<BookEntity> findBookByAllCriteria(BookSearchCriteria bookSearchCriteria);
	
	
}
