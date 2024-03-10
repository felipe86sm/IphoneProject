public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        // Testando métodos para reproduzir músicas

        iPhone.selectMusic("Pegasus Fantasy");
        iPhone.play();
        iPhone.pause();

        // Testando métodos para funcionalidade de aparelho telefônico

        iPhone.call();
        iPhone.answerPhone();
        iPhone.startVoicemail();

        // Testando métodos para a funcionalidade de Navegador de internet

        iPhone.displayPage();
        iPhone.addNewTab();
        iPhone.updatePage();

        // Testando métodos para funcionalidade de e-mail

        iPhone.sendEmail();
        iPhone.receiveEmail();
        iPhone.readEmail();
    }
}
