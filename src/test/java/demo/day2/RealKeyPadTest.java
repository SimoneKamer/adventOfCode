package demo.day2;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class RealKeyPadTest {

    private KeyPad keyPad = new RealKeyPad();

    @Test
    public void moveRight() throws Exception {
        keyPad.moveRight();
        validateCurrentKey("6");
    }

    @Test
    public void moveRightMoveUp() throws Exception {
        keyPad.moveRight();
        keyPad.moveUp();
        validateCurrentKey("2");
    }

    @Test
    public void moveLeft() throws Exception {
        keyPad.moveLeft();
        validateCurrentKey("5");
    }



    private void validateCurrentKey(String value) {
        assertThat(keyPad.getCharacterOfCurrentKey(),is(value));
    }

}