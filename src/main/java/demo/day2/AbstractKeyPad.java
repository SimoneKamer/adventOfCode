package demo.day2;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public abstract class AbstractKeyPad implements KeyPad {
    protected int x;
    protected int y;

    public AbstractKeyPad(int x, int y) {
        this.x = x;
        this.y = y;
    }


    protected Table<Integer, Integer, Key> keyPad = HashBasedTable.create();

    @Override
    public String getCharacterOfCurrentKey() {
        Key currentKey = keyPad.get(x, y);
        return currentKey.getCharacter();
    }

    protected void addKey(int x, int y, String value) {
        keyPad.put(x,y,new Key(value));
    }

    @Override
    public final void moveLeft() {
        if (keyPad.contains(x-1,y)){
            x--;
        }
    }

    @Override
    public final void moveUp() {
        if (keyPad.contains(x,y-1)) {
            y--;
        }
    }

    @Override
    public final void moveRight() {
        if (keyPad.contains(x+1,y)) {
            x++;
        }
    }

    @Override
    public final void moveDown() {
        if (keyPad.contains(x,y+1)) {
            y++;
        }
    }
}
