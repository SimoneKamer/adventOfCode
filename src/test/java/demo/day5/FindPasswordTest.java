package demo.day5;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindPasswordTest {
    @Test
    public void itShouldGive05ace8e3AsOutputForabc() throws Exception {

        assertThat(FindPassword.createPassword("abc"), is("05ace8e3"));
    }
}