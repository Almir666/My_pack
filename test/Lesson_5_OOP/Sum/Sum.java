package test.Lesson_5_OOP.Sum;

public class Sum {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int SumXY(int x, int y) {
        return x + y;
    }

    public int SumXY() {
        return x + y;
    }
}
