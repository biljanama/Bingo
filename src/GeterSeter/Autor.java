package GeterSeter;

public class Autor {

    //Zadatak 4:
    //Napraviti klasu Autor koji u sklopu ima ime, godinu rodjenja,ukupan broj prodanih dela i jednu knjigu.
    //Napraviti metodu:
    //-ranaObjava() -> ispisati poruku ako je autor objavio svoju knjigu pre 25 godine
    //-zarada() -> Koliko je zaradio ukupno para od svih prodanih dela ako racunamo da imaju isti cenu kao ta jedna knjiga

    private String ime;
    private int godinaRodjenja;
    private int ukupanBrojProdatih;
    private Knjiga k;

    public Autor (String ime, int godinaRodjenja, int ukupanBrojProdatih,Knjiga k) {
        this.ime=ime;
        this.godinaRodjenja=godinaRodjenja;
        this.ukupanBrojProdatih=ukupanBrojProdatih;
        this.k=k;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public int getUkupanBrojProdatih() {
        return ukupanBrojProdatih;
    }

    public void setUkupanBrojProdatih(int ukupanBrojProdatih) {
        this.ukupanBrojProdatih = ukupanBrojProdatih;
    }

    public Knjiga getK() {
        return k;
    }

    public void setK(Knjiga k) {
        this.k = k;
    }

    public void ranaObjava() {
        int autoroveGodine = getK().getGodinaIzdanja() - getGodinaRodjenja();
        if (autoroveGodine<=25) {
            System.out.println("ovo je rana objava autora");
        } else {
            System.out.println("nije rana objava");
        }

        //public double zarada() {
         //   double rez = getK().getCena()*getUkupanBrojProdatih();
         //   return rez;

    }
}
