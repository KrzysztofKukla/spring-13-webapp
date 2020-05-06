package pl.kukla.krzys.webapp.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * @author Krzysztof Kukla
 */
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
@Data
@NoArgsConstructor
public class Author extends AbstractEntity {

    private String firstName;
    private String lastName;

    @ManyToMany
    private Set<Book> books;

    @Builder
    public Author(Long id, String firstName, String lastName, Set<Book> books) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

}
