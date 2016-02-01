package pl.spring.demo.repository.impl;

import org.jinq.jpa.JPAJinqStream;
import org.jinq.jpa.JPQL;
import org.jinq.jpa.JinqJPAStreamProvider;
import org.springframework.beans.factory.annotation.Autowired;

import pl.spring.demo.booksearchcriteria.BookSearchCriteria;
import pl.spring.demo.entity.BookEntity;
import pl.spring.demo.repository.BookLambdaRepository;
import pl.spring.demo.entity.BookEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookLambdaRepository {

    @PersistenceContext(name = "hsql")
    private EntityManager entityManager;
    @Autowired
    private JinqJPAStreamProvider jinqJPAStreamProvider;

    @Override
    public List<BookEntity> findAllLibraries() {
        return jinqJPAStreamProvider.streamAll(entityManager, BookEntity.class).toList();
    }

	@Override
	public List<BookEntity> findBookByAllCriteria(BookSearchCriteria bookSearchCriteria) {
		// TODO Auto-generated method stub
		return null;
	}
}
