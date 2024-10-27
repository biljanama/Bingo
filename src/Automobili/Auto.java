package Automobili;

public class Auto {
    // Napraviti klasu Auto koja ima od atributa naziv modela, maksimalnu brzinu na sat, cenu i boju.
    //Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
    //Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
    //Klasa mora imati adekvatan konstruktor i toString

    String model;
    int maxBrzinaNaSat;
    double cena;
    String boja;

    public int vremeProlaskaZa1kkm () {
        return 1000/maxBrzinaNaSat;
    }

    public double popustNaBoju () {
        if (boja.equals("ljubičasta")) {
            return cena*0.9;
        } else {
            return cena;
        }



    }


    public Auto (String model, int maxBrzinaNaSat, int cena, String boja) {
        this.model = model;
        this.maxBrzinaNaSat= maxBrzinaNaSat;
        this.cena= cena;
        this.boja=boja;

    }
    public String toString () {
        return model + " " + maxBrzinaNaSat + " " + cena + " " + boja;

    }

}
