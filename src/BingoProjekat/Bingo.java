package BingoProjekat;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        //Napraviti program koji se sastoji od tri metode:
        //-unesiBrojeve() -> metoda vraca niz od 6 brojeva, to mogu biti brojevi
        //koji su odmah definisani, ubaceni preko skenera ili ubaceno preko Math.random().
        //Ovih 6 brojeva ce biti brojevi koji ce korisnik pogadjati.
        //-generisi() -> vraca nam niz od 30 nasumnicnih brojeva(nije bitno ako ima duplikata).
        //-bingo(int[] niz1,int[] niz2) -> prethodno dva izgenerisana niza proslednjujemo ovoj metodi i proveravamo
        //Koliko se nashi brojeva nalazi u izgenerisanom nizu, ispisati poruku ako korisnik pogodi bingo!**Ukoliko ima potrebe za neke modifikacije metoda u smislu da dodate nesto, napravite pomocnu metodu i to,
        //to je sve dozvoljno

        int[] niz = unetiBrojevi();
        int[] generNiz = generisi();

        int pogodjeno = bingo(niz, generNiz);
        System.out.println(pogodjeno);

    }

    public static int[] unetiBrojevi() {
        Scanner sc = new Scanner(System.in);
        int[] niz = new int[6];
        System.out.println("Unesite 6 celih brojeva:");

        for (int i=0; i<niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static int[] generisi() {
        int[] generisanNiz = new int[30];

        for (int i=0; i< generisanNiz.length;i++) {
            generisanNiz[i] = (int) (Math.random() * 100);
        }
        return generisanNiz;
    }

    public static int bingo (int[] niz1, int[] niz2) {
        int countPogodjenih = 0;

        for (int i=0; i< niz1.length;i++) {
            if (brojUNizu(niz2, niz1[i] )) {
                countPogodjenih = countPogodjenih+1;
            }
        }
        return countPogodjenih;
    }

    public static boolean brojUNizu (int[] niz, int a) {

        for (int i=0; i<niz.length;i++) {
            if (a==niz[i]) {
                return true;
            }
        }
        return false;
    }

    //alternativni nacin za bingo metod je ispod, nisam bila sigurna da li se radi ovako pa sam prvo radila sa pomocnom metodom iznad

    public static int bingoAlt (int[] niz1, int[] niz2) {
        int countPogodjenih = 0;

        for (int i=0; i< niz1.length;i++) {
            for (int j=0; j<niz2.length;j++) {
                if (niz1[i]==niz2[j]){
                    countPogodjenih++;
                    break;
                }
            }
        }
        return countPogodjenih;


    }




}
