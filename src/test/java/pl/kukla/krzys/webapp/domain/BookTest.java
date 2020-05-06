package pl.kukla.krzys.webapp.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Krzysztof Kukla
 */
class BookTest {

    @Test
    void equalsTest() throws Exception {
        Book b1 = Book.builder().id(2L).title("a").isbn("id").build();
        Book b2 = Book.builder().id(2L).title("2").isbn("id3").build();
        Assertions.assertEquals(b1,b2);
    }
}