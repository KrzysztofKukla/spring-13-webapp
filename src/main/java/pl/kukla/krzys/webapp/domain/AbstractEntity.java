package pl.kukla.krzys.webapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Krzysztof Kukla
 */
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
}
