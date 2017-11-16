package demo.day2;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class KeyPadTest {

    KeyPad keyPad = new KeyPad();

    @Test
    public void itShouldTellCharacterOfCurrentKey() throws Exception {
        validateCurrentKey("5");
    }

    @Test
    public void itShouldTellCharacterKeyUp() throws Exception {
        keyPad.moveUp();
        validateCurrentKey("2");
    }

    @Test
    public void itShouldTellCharacterKeyLeft() throws Exception {
        keyPad.moveLeft();
        validateCurrentKey("4");
    }

    @Test
    public void moveRight() throws Exception {
        keyPad.moveRight();
        validateCurrentKey("6");
    }

    @Test
    public void moveDown() throws Exception {
        keyPad.moveDown();
        validateCurrentKey("8");
    }

    @Test
    public void handleTwoSubsequentInstructions() throws Exception {
        keyPad.moveRight();
        keyPad.moveDown();
        validateCurrentKey("9");
    }

    @Test
    public void moveUpAtTopRow() throws Exception {
        keyPad.moveUp();
        keyPad.moveUp();
        validateCurrentKey("2");
    }

    @Test
    public void moveLeftAtLeftColumn() throws Exception {
        keyPad.moveLeft();
        keyPad.moveLeft();
        validateCurrentKey("4");
    }

    @Test
    public void moveRightAtRightColumn() throws Exception {
        keyPad.moveRight();
        keyPad.moveRight();
        validateCurrentKey("6");
    }

    @Test
    public void moveDownAtLowerRow() throws Exception {
        keyPad.moveDown();
        keyPad.moveDown();
        validateCurrentKey("8");
    }

    private void validateCurrentKey(String value) {
        assertThat(keyPad.getCharacterOfCurrentKey(),is(value));
    }
}