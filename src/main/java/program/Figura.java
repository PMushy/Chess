package program;

public abstract class Figura {
    private String nazwa;

    private boolean zbity;
    private boolean bialy;

    public Figura(String nazwa, Boolean bialy) {
        this.nazwa = nazwa;
        this.setBialy(bialy);
    }

    public boolean isBialy(){
        return this.bialy == true;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setBialy(boolean bialy) {
        this.bialy = bialy;
    }

    public boolean isZbity() {
        return this.zbity = true;
    }

    public void setZbity(boolean zbity) {
        this.zbity = zbity;
    }

    public String getNazwa() {
        return nazwa;
    }

    public abstract boolean czyDozRuch(Szachownica szachownica, Pole start, Pole end);

}
