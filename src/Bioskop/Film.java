package Bioskop;

public class Film {

    //Napraviti klasu Film koji od atributa ima godinu objavljivanja, glavnog glumca I ukupno zaradjenih para.
    //    //Napraviti metode:
    //    //- godineGlavnogGlumca() -> kao rezultat vraca broj godina koje je glumac imao kad je snimio film
    //    //- troskovi() -> vraca nam koliki su troskovi ako racunamo da iznose 20% od ukupne zarade filma

    private int godinaObjavljivanja;
    private double ukupnaZarada;
    private Glumac g;


    public Film (int godinaObjavljivanja, int ukupnaZarada, Glumac g) {
        this.godinaObjavljivanja=godinaObjavljivanja;
        this.ukupnaZarada=ukupnaZarada;
        this.g=g;
    }

    public Glumac getG() {
        return g;
    }

    public int getGodinaObjavljivanja() {
        return godinaObjavljivanja;
    }

    public double getUkupnaZarada() {
        return ukupnaZarada;
    }

    public void setG(Glumac g) {
        this.g = g;
    }

    public void setGodinaObjavljivanja(int godinaObjavljivanja) {
        this.godinaObjavljivanja = godinaObjavljivanja;
    }

    public void setUkupnaZarada(double ukupnaZarada) {
        this.ukupnaZarada = ukupnaZarada;
    }

    public int godineGlavnogGlumca() {
        int rezultat= godinaObjavljivanja - g.getGodinaRodjenja();
        return rezultat;
    }

    public double troskovi() {
        double rezultat = ukupnaZarada * 0.2;
        return rezultat;
    }

    public String toString() {
        return " " + godinaObjavljivanja + godineGlavnogGlumca();
    }
}
