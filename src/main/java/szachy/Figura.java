package szachy;

import szachy.figury.*;

public abstract class Figura {
    private String name;
    private Kolor color;
    private Pozycja pozycja;
    private TypFigury typFigury;
    private boolean alive;

    public Figura() {
    }

    public Figura(String name, Kolor color, Pozycja pozycja) {
        this.name = name;
        this.color = color;
        this.pozycja = pozycja;
        this.alive = true;
    }

    public static Figura FiguraFactory(TypFigury typFigury) throws Exception {
        switch (typFigury) {
            case PIONEK:
                return new Pionek();
            case WIEZA:
                return new Wieza();
            case SKOCZEK:
                return new Skoczek();
            case GONIEC:
                return new Goniec();
            case HETMAN:
                return new Hetman();
            case KROL:
                return new Krol();
            default:
                break;
        }
        throw new Exception("Nie istnieje figura typu " + typFigury.toString());
    }

    public static void PorownajFigury(Figura f1, Figura f2) {
        if (null != f1.getName() && null != f2.getName()) {
            boolean flag = f1.getName().equals(f2.getName());
            System.out.println(flag);
            System.out.println(f1.getName() + " " + f2.getName());
        }
        if (null != f1.getColor() && null != f2.getColor()) {
            boolean flag = f1.getColor().equals(f2.getColor());
            System.out.println(flag);
            System.out.println(f1.getColor() + " " + f2.getColor());
        }
        if (null != f1.getPozycja() && null != f2.getPozycja()) {
            boolean flag = f1.getPozycja().toString().equals(f2.getPozycja().toString());
            System.out.println(flag);
            System.out.println(f1.getPozycja() + " " + f2.getPozycja());
        }
    }


    public abstract boolean czyDozRuch(Pozycja start, Pozycja end);

    public boolean czyAwansuj(Pionek pionek) {
        if (pionek.getColor() == Kolor.BIALY) {
            return pionek.getPozycja().getX() == 7;
        } else return pionek.getPozycja().getX() == 0;
    }

    public Figura Awansuj(Figura figura) throws Exception {
        return figura = FiguraFactory(TypFigury.HETMAN);
    }

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

    public TypFigury getTypFigury() {
        return typFigury;
    }

    public void setTypFigury(TypFigury typFigury) {
        this.typFigury = typFigury;
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
