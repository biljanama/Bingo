package GeterSeter;

public class Sportista {

    //Napraviti klasu Sportista koji od atributa ima ime, broj nagrada i godinu rodjenja.
    //Napraviti metodu:
    //- penzija(int potrebnoNagrada) -> ova metoda prima kao argument neki potreban broj nagrada da bi
    //sportista otisao u penziju
    //- veteran() -> metoda ispisuje poruku o tome da li je ovaj sportista veteran, tj stariji od 40 godina
    //Napraviti adekvatan konstruktor, get i set metod, kao i toString.

    private String ime;
    private int brojNagrada;
    private int godinaRodjenja;

    public Sportista (String ime, int brojNagrada, int godinaRodjenja) {
        this.ime=ime;
        this.brojNagrada=brojNagrada;
        this.godinaRodjenja=godinaRodjenja;
    }

    public String toString() {
        return ime + " " + brojNagrada + " " + godinaRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String drugoIme) {
        this.ime = ime;
    }
    public int getBrojNagrada() {
        return brojNagrada;
    }
    public void setBrojNagrada(int promenaBrojaNagrada) {
        this.brojNagrada=promenaBrojaNagrada;
    }
    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int drugaGodinaRodjenja) {
        this.godinaRodjenja = drugaGodinaRodjenja;
    }

    public boolean penzija (int potrebnoNagrada) {
        if (getBrojNagrada()>= potrebnoNagrada) {
            System.out.println("Uyivajte u penyiji");
           return true;
        } else {
            System.out.println("Imate jos do penyije");
            return false;
        }

    }

    public void veteran() {
        if ((2024 - godinaRodjenja) >40 ) {
            System.out.println("Sportista je veteran");
        } else {
            System.out.println("Niste veteran");
        }
    }
}
