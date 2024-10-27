package Bioskop;

public class Romantika extends Film{

    public Romantika(int godinaObjavljivanja, int ukupnaZarada, Glumac g) {
        super(godinaObjavljivanja, ukupnaZarada, g);
    }

    @Override
    public double troskovi() {
        double rezultat = getUkupnaZarada() * 0.1;
        return rezultat;
    }
}
