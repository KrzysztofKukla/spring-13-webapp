package pl.kukla.krzys.webapp.web.mapper;

import org.mapstruct.Mapper;
import pl.kukla.krzys.webapp.domain.Book;
import pl.kukla.krzys.webapp.web.model.BookDto;

/**
 * @author Krzysztof Kukla
 */
@Mapper
public interface BookMapper {
    Book bookDtoToBook(BookDto bookDto);

    BookDto bookToBookDto(Book book);

}
