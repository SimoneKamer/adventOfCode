package demo.day2;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public abstract class AbstractKeyPad implements KeyPad {
    private int x;
    private int y;

    AbstractKeyPad(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Table<Integer, Integer, String> keyPad = HashBasedTable.create();

    @Override
    public String getCharacterOfCurrentKey() {
        return keyPad.get(x, y);
    }

    void addKey(int x, int y, String value) {
        keyPad.put(x,y,value);
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
