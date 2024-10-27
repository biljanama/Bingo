package Bioskop;

public class AkcioniFilm extends Film{

    public AkcioniFilm(int godinaObjavljivanja, int ukupnaZarada, Glumac g) {
        super(godinaObjavljivanja, ukupnaZarada, g);
    }

    @Override
    public double troskovi() {
        double rezultat = getUkupnaZarada()*0.4;
        return rezultat;
    }
}
