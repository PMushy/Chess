package program;

public class Pole {
    private Figura figura;
    private int x;
    private int y;

    public Pole(int x, int y, Figura figura) {
        this.setFigura(figura);
        this.setX(x);
        this.setY(y);
    }

    public Figura getFigura() {
        return this.figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
