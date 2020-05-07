package pl.kukla.krzys.webapp.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * @author Krzysztof Kukla
 */
@EqualsAndHashCode
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {

    @NotBlank
    private String title;
    @NotBlank
    @Size(min = 4, max = 10)
    private String isbn;
    @NotNull
    private Set<AuthorDto> authors;
    @NotNull
    private PublisherDto publisher;

}
