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

    @Test
    public void goingDownAtLastRow() {assertThat(decoder.findBathroomCode("DD"),is(8));}

    @Test
    public void goingLeftAtFirstColumn() {assertThat(decoder.findBathroomCode("LL"),is(4));}

    @Test
    public void goingRightAtLastColumn() {assertThat(decoder.findBathroomCode("RR"),is(6));}

    @Test
    public void firstExample() {assertThat(decoder.findBathroomCode("ULL"),is(1));}

    @Test
    public void secondExample() {assertThat(decoder.findBathroomCode("ULLRRDDD"),is(9));}

    @Test
    public void thirdExample() {assertThat(decoder.findBathroomCode("ULLRRDDDLURDL"),is(8));}

    @Test
    public void fourthExample() {assertThat(decoder.findBathroomCode("ULLRRDDDLURDLUUUUD"),is(5));}

    // make sure the next instruction starts at the end of the former instruction
    // test all examples in day2
// handle end of line / total: make PSVM
}