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

    @Test
    public void fromStartingPointLeftMakes4() {
        assertThat(decoder.findBathroomCode("L"),is(4));
    }

    @Test
    public void fromStartingPointRightMakes6() {
        assertThat(decoder.findBathroomCode("R"),is(6));
    }

    @Test
    public void handleTwoSubsequentInstructions() {
        assertThat(decoder.findBathroomCode("RU"),is(3));
    }

    @Test
    public void goingUpAtTopRow() {assertThat(decoder.findBathroomCode("UU"),is (2));}

// handle "corner cases" up at 1,2,3 / down at 7,8,9 / left at 1,4,7 / right at 3,6,9
// test all examples in day2
// handle end of line / total: make PSVM
}