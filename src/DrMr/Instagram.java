package DrMr;

public class Instagram extends DrustveneMreze{


    public Instagram(int brojKorisnika, int brojReklama) {
        super(brojKorisnika, brojReklama);
    }

    @Override
    public double zarada() {
        double instaZarada= (getBrojKorisnika()) + (getBrojReklama()*10);
        return instaZarada;
    }
}
