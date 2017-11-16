package demo.day2;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class KeyPadTest {

    KeyPad keyPad = new KeyPad();

    @Test
    public void itShouldTellCharacterOfCurrentKey() throws Exception {
        assertThat(keyPad.getCharacterOfCurrentKey(),is("5"));
    }

    @Test
    public void itShouldTellCharacterKeyUp() throws Exception {
        keyPad.moveUp();
        assertThat(keyPad.getCharacterOfCurrentKey(),is("2"));
    }

    @Test
    public void itShouldTellCharacterKeyLeft() throws Exception {
        keyPad.moveLeft();
        assertThat(keyPad.getCharacterOfCurrentKey(),is("4"));
    }

    @Test
    public void moveRight() throws Exception {
        keyPad.moveRight();
        assertThat(keyPad.getCharacterOfCurrentKey(),is("6"));
    }

    @Test
    public void moveDown() throws Exception {
        keyPad.moveDown();
        assertThat(keyPad.getCharacterOfCurrentKey(),is("8"));
    }
}