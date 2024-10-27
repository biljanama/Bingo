package DrMr;


public class Main {
    public static void main(String[] args) {

        DrustveneMreze fb = new Facebook(1000, 100);
        DrustveneMreze ig = new Instagram(2000, 150);
        DrustveneMreze tt = new TikTok(100,100 );

        System.out.println(fb.zarada());
        ig.upozorenje();
    }


}
