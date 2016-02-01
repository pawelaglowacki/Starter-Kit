package pl.spring.demo.booksearchcriteria;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class BookSearchCriteria implements Serializable {

	private	String title; 
	private	String author; 
	private	String BookName;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String BookName) {
		this.BookName = BookName;
	}
	public BookSearchCriteria() {
	}
	
    public static class BookSearchCriteriaBuilder {
        private BookSearchCriteria BookSearchCriteria = new BookSearchCriteria();

        public BookSearchCriteriaBuilder withName(String title) {
            BookSearchCriteria.title = title;
            return this;
        }

        public BookSearchCriteriaBuilder withAuthor(String author) {//
            BookSearchCriteria.author = author;
            return this;
        }

        public BookSearchCriteria build() {
            return BookSearchCriteria;
        }
    }

}