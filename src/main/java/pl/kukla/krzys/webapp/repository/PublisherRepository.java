package pl.kukla.krzys.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kukla.krzys.webapp.domain.Publisher;

/**
 * @author Krzysztof Kukla
 */
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
