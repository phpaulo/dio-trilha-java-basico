package app;

import interfaces.IBrowser;
import interfaces.ICallHandler;
import interfaces.IMusicPlayer;

import java.sql.SQLOutput;

public class Iphone implements IMusicPlayer, ICallHandler, IBrowser {

    @Override
    public void playMusic() {
        System.out.println("Tocando a música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música foi pausada.");
    }

    @Override
    public void selectMusic(String nameMusic) {
        System.out.println("A música selecionada é: " + nameMusic + ".");
    }

    @Override
    public void makeCall(String numberPhone) {
        System.out.println("Ligando para o número: " + numberPhone + ".");
    }

    @Override
    public void takeCall() {
        System.out.println("Atendendo uma chamada.");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando o correio de voz.");
    }

    @Override
    public void showPage(String url) {
        System.out.println("Exibindo o página: " + url);
    }

    @Override
    public void addNewPage() {
        System.out.println("Acessando uma nova página.");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando a página.");
    }
}
