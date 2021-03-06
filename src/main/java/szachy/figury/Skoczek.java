package szachy.figury;

import szachy.Figura;
import szachy.Kolor;
import szachy.Pozycja;

public class Skoczek extends Figura {
    private TypFigury typFigury;

    public Skoczek() {
    }

    public Skoczek(String name, Kolor color, Pozycja pozycja) {
        super(name, color, pozycja);
        this.typFigury = TypFigury.SKOCZEK;

    }

    @Override
    public boolean czyDozRuch(Pozycja start, Pozycja end) {
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());

        return x * y == 2;
    }
}
