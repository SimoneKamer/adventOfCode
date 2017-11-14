package demo.day2;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import static org.hamcrest.Matchers.is;


public class BathroomLockDecoderTest {
    BathroomLockDecoder decoder = new BathroomLockDecoder();

    @Test
    public void itShouldAnswer2() {
        assertThat(decoder.findBathroomCode("U"),is(2));
    }

}