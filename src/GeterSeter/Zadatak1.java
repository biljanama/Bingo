package GeterSeter;

public class Zadatak1 {

    private String model;
    private int maxBrzinaNaSat;
    private double cena;
    private String boja;

    public Zadatak1 (String model, int maxBrzinaNaSat, double cena, String boja) {
        this.model=model;
        this.maxBrzinaNaSat=maxBrzinaNaSat;
        this.cena=cena;
        this.boja=boja;
    }

    public String toString() {
        return model + " " + maxBrzinaNaSat + " " + cena + " " + boja;
    }

    public String getModel() {
        return model;
    }
    public int getMaxBrzinaNaSat() {
        return maxBrzinaNaSat;
    }
    public double getCena() {
        return cena;
    }
    public String getBoja() {
        return boja;
    }

    public void setModel(String drugiModel) {
        this.model=drugiModel;
    }

    public void setMaxBrzinaNaSat(int povecanjeBrzine ) {
        this.maxBrzinaNaSat =povecanjeBrzine;
    }

}
