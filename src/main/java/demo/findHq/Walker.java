package demo.findHq;

public class Walker {

    private Integer x = 0;
    private Integer y = 0;
    private Direction direction = Direction.NORTH;

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void walk() {
        switch (direction) {

            case NORTH:
                { y ++; }
                break;
            case EAST:
                { x ++; }
                break;
            case SOUTH:
                { y --; }
                break;
            case WEST:
                { x --; }
                break;
        }
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
}
