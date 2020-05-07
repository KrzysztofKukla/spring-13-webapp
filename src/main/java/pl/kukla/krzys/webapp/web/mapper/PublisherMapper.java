package pl.kukla.krzys.webapp.web.mapper;

import org.mapstruct.Mapper;
import pl.kukla.krzys.webapp.domain.Publisher;
import pl.kukla.krzys.webapp.web.model.PublisherDto;

/**
 * @author Krzysztof Kukla
 */
@Mapper
public interface PublisherMapper {
    Publisher publisherDtoToPublisher(PublisherDto publisherDto);

    PublisherDto publisherDtoToPublisher(Publisher publisher);

}
