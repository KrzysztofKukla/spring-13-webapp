package pl.kukla.krzys.webapp.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@NoArgsConstructor
public class Book extends AbstractEntity {

    private String title;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "author_table",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Set<Author> authors = new HashSet<>();

    @Builder
    public Book(Long id, String title, String isbn, Set<Author> authors) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

}
