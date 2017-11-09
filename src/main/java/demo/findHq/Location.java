package demo.findHq;

public class Location{
Integer x;
Integer y;
    public Location(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Location) {
            Location other = (Location)obj;
            if (this.x.equals(other.getX())&& this.y.equals(other.getY())){
                return true;
            }
        } return false;
    }


    @Override
    public int hashCode() {
        return this.x;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
