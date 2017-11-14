package demo.day2;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import static org.hamcrest.Matchers.is;


public class BathroomLockDecoderTest {
    BathroomLockDecoder decoder = new BathroomLockDecoder();

    @Test
    public void fromStartingPointUpMakes2() {
        assertThat(decoder.findBathroomCode("U"),is(2));
    }

    @Test
    public void fromStartingPointDownMakes8() {
        assertThat(decoder.findBathroomCode("D"),is(8));
    }

}