package pl.kukla.krzys.webapp.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * @author Krzysztof Kukla
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Book extends AbstractEntity {

    private String title;
    private String isbn;

    @ManyToMany(mappedBy = "books")
    @JoinTable(name = "author_table",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Set<Author> authors;

    @Builder
    public Book(Long id, String title, String isbn, Set<Author> authors) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

}
