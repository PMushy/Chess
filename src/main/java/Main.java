import figury.Krol;
import figury.Skoczek;
import program.Figura;
import program.Szachownica;

public class Main {
    public static void main(String[] args) {
        Szachownica szachownica = new Szachownica();
        Figura krol = new Krol("", true);
        Figura skoczek = new Skoczek("", false);
        System.out.println(krol);
        System.out.println(skoczek);

        szachownica.wypiszWszystko();


    }
}
