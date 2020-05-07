package pl.kukla.krzys.webapp.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Krzysztof Kukla
 */
class BookTest {

    @Test
    void equalsTest() throws Exception {
        Book b1 = Book.builder().title("a").isbn("id").build();
        b1.setId(2L);
        Book b2 = Book.builder().title("2").isbn("id3").build();
        b2.setId(2L);
        Assertions.assertEquals(b1, b2);
    }
}