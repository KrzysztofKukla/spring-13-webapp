package pl.kukla.krzys.webapp.bootstrap;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.kukla.krzys.webapp.domain.Author;
import pl.kukla.krzys.webapp.domain.Book;
import pl.kukla.krzys.webapp.repository.AuthorRepository;
import pl.kukla.krzys.webapp.repository.BookRepository;

import java.util.HashSet;

/**
 * @author Krzysztof Kukla
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class DataLoader implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        clearAll();
        addObjects();
    }

    private void addObjects() {
        Book book1 = Book.builder().title("title1").isbn("isbn1").authors(new HashSet<>()).build();
        Book book2 = Book.builder().title("title2").isbn("isbn2").authors(new HashSet<>()).build();

        Author author1 = Author.builder().firstName("firstAuthorName1").lastName("lastAuthorName1").books(new HashSet<>()).build();
        Author author2 = Author.builder().firstName("firstAuthorName1").lastName("lastAuthorName1").books(new HashSet<>()).build();

        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        authorRepository.save(author1);
        bookRepository.save(book1);

        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        authorRepository.save(author2);
        bookRepository.save(book2);

        log.debug("Data has been loaded");
    }

    private void clearAll() {
        authorRepository.deleteAll();
        bookRepository.deleteAll();
    }

}
