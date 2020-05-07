package pl.kukla.krzys.webapp.web.mapper;

import org.mapstruct.Mapper;
import pl.kukla.krzys.webapp.domain.Author;
import pl.kukla.krzys.webapp.web.model.AuthorDto;

/**
 * @author Krzysztof Kukla
 */
@Mapper
public interface AuthorMapper {
    Author authorDtoToAuthor(AuthorDto authorDto);

    AuthorDto authorToAuthorDto(Author author);

}
