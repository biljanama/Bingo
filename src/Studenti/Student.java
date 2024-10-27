package Studenti;

public class Student {

    // Napraviti klasu Student koji ima od atributa ime i listu ocena.
    //Napraviti metodu koja racuna studentov prosek.
    //Napraviti metodu koja proverava prosek I ukoliko je manji od 1.5 ispisati poruku da mora na popravni.
    //Klasa mora imati adekvatan konstruktor I toString.

    String ime;
    int[] ocene;

    public Student ( String ime, int[] ocene) {
        this.ime=ime;
        this.ocene=ocene;
    }

    public String toString(){
        return ime + ocene;
    }

    public double prosek() {
        double zbirOcena =0;

        for (int i=0; i < ocene.length;i++) {
            zbirOcena = zbirOcena + ocene[i];
        }
        return zbirOcena/ocene.length;
    }

    public void proveriProsek() {
        if(prosek() <1.5){
            System.out.println("Potrebno je da uradis popravni test.");
        } else {
            System.out.println("Prosao si test");
        }
    }

}
