package pl.kukla.krzys.webapp.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
    private Set<Author> authors;

    @ManyToOne(cascade = CascadeType.ALL)
    private Publisher publisher;

    @Builder
    public Book(String title, String isbn, Set<Author> authors, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
    }

}
