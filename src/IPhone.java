import interfaces.Email;
import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.Telephone;

public class IPhone implements MusicPlayer, Telephone, InternetBrowser, Email {

    @Override
    public void play() {
        System.out.println("Tocando música");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");

    }

    @Override
    public void selectMusic(String name) {
        System.out.println("Música " + name + " selecionada");
    }

    @Override
    public void call() {
        System.out.println("Fazendo ligação...");
    }

    @Override
    public void answerPhone() {
        System.out.println("Atendendo telefone...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void displayPage() {
        System.out.println("Exibindo página...");

    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void sendEmail() {
        System.out.println("Enviando Email...");
    }

    @Override
    public void receiveEmail() {
        System.out.println("Recebendo Email...");

    }

    @Override
    public void readEmail() {
        System.out.println("Lendo Email...");
    }
}
