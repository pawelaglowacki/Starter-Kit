package pl.spring.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.spring.demo.mapper.BookMapper;
import pl.spring.demo.service.BookService;
import pl.spring.demo.to.BookTo;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {
	
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String bookList(Map<String, Object> params) { // all lists
        final List<BookTo> allBooks = bookService.findAllBooks();
        params.put("books", allBooks);
        return "bookList";
    }
    
    
    @RequestMapping(value = "/books", method = {RequestMethod.POST})
	public String deleteBook(Map<String, Object> params, @RequestParam("id") Long id, @RequestParam("title") String title,@RequestParam("authors") String authors) {
		BookTo book = new BookTo(id, title, authors);
	//	BookTo book = bookService.findById(id); //
		params.put("book", BookMapper.map(book));


		bookService.deleteBook(book);
		return "deletedBook";
	}

}