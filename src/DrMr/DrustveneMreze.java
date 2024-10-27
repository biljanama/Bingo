package DrMr;

    public class DrustveneMreze {

        //Napraviti klasu DrustvenaMreza koja od atributa ima broj korisnika i broj reklama.
        //Napraviti metodu:
        //- zarada() -> racuna zaradu za drustvene mreze ako zaradjuje 2 po korisniku a 5 po reklami.
        //- upozorenje() -> ispisuje poruku o upozorenju ukoliko drustvena mreza nema dovoljno korisnika (manje od 200)
        //Napraviti klasu Facebook koji nasledjuje klasu DrustvenaMreza.
        //Napraviti klasu Instagram koji nasledjuje klasu DrustvenaMreza I on zaradjuje 1 po korisniku I 10 po reklami.
        //Napraviti klasu TikTok koji nasledjuje klasu DrustvenaMreza I on ispisuje upozorenje ukoliko ima manje od 500 korisnika.

        private int brojKorisnika;
        private int brojReklama;

        public DrustveneMreze (int brojKorisnika, int brojReklama) {
            this.brojKorisnika=brojKorisnika;
            this.brojReklama=brojReklama;
        }

        public int getBrojKorisnika() {
            return brojKorisnika;
        }

        public int getBrojReklama() {
            return brojReklama;
        }

        public void setBrojKorisnika(int brojKorisnika) {
            this.brojKorisnika = brojKorisnika;
        }

        public void setBrojReklama(int brojReklama) {
            this.brojReklama = brojReklama;
        }

        public double zarada() {
            double ukupnaZarada=(5 *brojReklama)+(2 *brojKorisnika);
            return ukupnaZarada;
        }

        public void upozorenje() {
            if(brojKorisnika<200) {
                System.out.println("Nema dovoljno korisnika");
            }
        }

        public String toString() {
            return "Broj korisnika: " + brojKorisnika + "Broj reklama" + brojReklama;
        }
}
