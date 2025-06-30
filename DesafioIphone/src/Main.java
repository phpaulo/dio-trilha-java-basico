import app.Iphone;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("================================================================");
        iphone.selectMusic("Nothing Else Matters - Metallica");
        iphone.playMusic();
        iphone.pauseMusic();
        System.out.println("================================================================");

        iphone.makeCall("55 116354-3354");
        iphone.takeCall();
        iphone.startVoicemail();
        System.out.println("================================================================");

        iphone.addNewPage();
        iphone.showPage("https://www.facebook.com/instituicaovaldi/");
        iphone.updatePage();
        System.out.println("================================================================");

    }
}
