package demo.day2;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class KeyPad {


    private int x = 1;
    private int y = 1;
    private Table<Integer, Integer, Key> keyPad = HashBasedTable.create();

    public KeyPad() {
        keyPad.put(0,0,new Key("1"));
        keyPad.put(1,0,new Key("2"));
        keyPad.put(2,0,new Key("3"));

        keyPad.put(0,1,new Key("4"));
        keyPad.put(1,1,new Key("5"));
        keyPad.put(2,1,new Key("6"));

        keyPad.put(0,2,new Key("7"));
        keyPad.put(1,2,new Key("8"));
        keyPad.put(2,2,new Key("9"));
    }

    public String getCharacterOfCurrentKey() {
        Key currentKey = keyPad.get(x, y);
        return currentKey.getCharacter();
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        }
    }

    public void moveLeft() {
        if (x>0) {
            x--;
        }
    }

    public void moveRight() {
        if (x<2){
            x++;
        }
    }

    public void moveDown() {
        if (y<2) {
            y++;
        }
    }
}
