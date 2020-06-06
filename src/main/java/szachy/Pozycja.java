package szachy;

public class Pozycja {
    private final int x;
    private final int y;

    public Pozycja(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Pozycja{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
