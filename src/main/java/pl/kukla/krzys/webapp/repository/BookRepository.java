package pl.kukla.krzys.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kukla.krzys.webapp.domain.Book;

/**
 * @author Krzysztof Kukla
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
