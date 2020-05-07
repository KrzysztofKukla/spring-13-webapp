package pl.kukla.krzys.webapp.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
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
public class PublisherDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String addressLine;
    @NotEmpty
    private String city;
    @NotEmpty
    private String state;
    @NotEmpty
    private String zip;

    private Set<BookDto> booksDto;

}
