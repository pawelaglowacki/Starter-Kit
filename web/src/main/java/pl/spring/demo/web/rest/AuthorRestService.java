package pl.spring.demo.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import pl.spring.demo.service.AuthorService;
import pl.spring.demo.to.AuthorTo;
import java.util.List;

@RestController
@RequestMapping(value="/authors")
public class AuthorRestService {

	@Autowired
	private AuthorService authorService;

	@RequestMapping(value = "/author", method = RequestMethod.GET)
	public List<AuthorTo> findAuthors() {
		return authorService.findAllAuthors();
	}
}
