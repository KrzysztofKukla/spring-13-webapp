package pl.kukla.krzys.webapp.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.kukla.krzys.webapp.service.BookService;
import pl.kukla.krzys.webapp.web.model.BookListDto;

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping("/v1/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public BookListDto getBooks() {
        return bookService.getBookList();
    }

}
