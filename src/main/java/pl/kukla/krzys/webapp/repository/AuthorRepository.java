package pl.kukla.krzys.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kukla.krzys.webapp.domain.Author;

/**
 * @author Krzysztof Kukla
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
