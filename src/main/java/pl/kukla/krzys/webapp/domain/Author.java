package pl.kukla.krzys.webapp.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Krzysztof Kukla
 */
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Author extends AbstractEntity {

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    @Builder
    public Author(Long id, String firstName, String lastName, Set<Book> books) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

}
