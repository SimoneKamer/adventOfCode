package demo.day7;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AbbaFinderTest {

    @Test
    public void ItShouldFindAbba() throws Exception {
        AbbaFinder finder = new AbbaFinder();
        String input = "abba";
        assertThat(finder.abbaFound(input), is(true));
    }

    @Test
    public void itShouldNotFindAbba() throws Exception {
        AbbaFinder finder = new AbbaFinder();
        String input = "abxa";
        assertThat(finder.abbaFound(input), is(false));
    }
}