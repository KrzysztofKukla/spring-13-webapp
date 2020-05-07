package pl.kukla.krzys.webapp.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kukla.krzys.webapp.domain.Book;
import pl.kukla.krzys.webapp.repository.BookRepository;
import pl.kukla.krzys.webapp.service.BookService;
import pl.kukla.krzys.webapp.web.mapper.BookMapper;
import pl.kukla.krzys.webapp.web.model.BookDto;
import pl.kukla.krzys.webapp.web.model.BookListDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krzysztof Kukla
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookListDto getBookList() {
        log.debug("Getting all books");

        List<Book> books = bookRepository.findAll();
        List<BookDto> bookDtoList = books.stream()
            .map(bookMapper::bookToBookDto)
            .collect(Collectors.toList());
        return BookListDto.builder().bookDtoList(bookDtoList).build();
    }

}
