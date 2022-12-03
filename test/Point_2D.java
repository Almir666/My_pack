package test;

public class Point_2D {
    private int x, y;

    public Point_2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
public Point_2D(int value) {
    this(value, value);
}
public Point_2D() {
    this(0);
}
    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x , y);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
