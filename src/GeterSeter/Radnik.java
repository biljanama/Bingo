package GeterSeter;

public class Radnik {

    //Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
    //Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
    //ukoliko se radnik tu nalazi vise od 5 godina, i povisicu od 40% ukoliko ima
    //staz duzi od 10 godina.
    //Napraviti adekvatan konstruktor, get i set metod, kao i toString.

    private int id;
    private int godinaZaposlenja;
    private double plata;

    public Radnik (int id, int godinaZaposlenja, double plata) {
        this.id=id;
        this.godinaZaposlenja=godinaZaposlenja;
        this.plata=plata;
    }

    public int getId() {
        return id;
    }

    public void setId(int noviId) {
        this.id=noviId;
    }
    public int getGodinaZaposlenja() {
        return godinaZaposlenja;
    }
    public void setGodinaZaposlenja(int promenjenaGodina){
        this.godinaZaposlenja=promenjenaGodina;
    }
    public double getPlata() {
        return plata;
    }
    public void setPlata(double novaPlata) {
        this.plata=novaPlata;
    }

    public int staz() {
        return 2024 - getGodinaZaposlenja();
    }


    public void povisica() {
             double plataNakonPovisice= getPlata();
        if(staz()> 5 && staz()<=10) {
            plataNakonPovisice*=1.2;
            setPlata(plataNakonPovisice);
        } else {
            if (staz()>10) {
                plataNakonPovisice*=1.4;
            }
            setPlata(plataNakonPovisice);
        }


    }
}
