package DrMr;

public class TikTok extends DrustveneMreze{


    public TikTok(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public void upozorenje() {
        if (getBrojKorisnika() < 500) {
            System.out.println("Nema dovoljno korisnika");
        }
    }
}
