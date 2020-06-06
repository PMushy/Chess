package szachy;

public abstract class Figura {
    private String name;
    private Kolor color;
    private Pozycja pozycja;
    private boolean alive;

    public Figura() {
    }

    public Figura(String name, Kolor color, Pozycja pozycja) {
        this.name = name;
        this.color = color;
        this.pozycja = pozycja;
        this.alive = true;
    }

    public abstract boolean czyDozRuch(Pozycja start, Pozycja end);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kolor getColor() {
        return color;
    }

    public void setColor(Kolor color) {
        this.color = color;
    }

    public Pozycja getPozycja() {
        return pozycja;
    }

    public void setPozycja(Pozycja pozycja) {
        this.pozycja = pozycja;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void kill() {
        this.alive = false;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", pozycja='" + pozycja + '\'' +
                '}';
    }
}
