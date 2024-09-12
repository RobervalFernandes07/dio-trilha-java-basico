package DispositivoMovel;

public class iphone implements  ReprodutorMusical , AparelhoTelefonico , NavegadorInternet{


    @Override public void tocar(){
        System.out.println("Reproduzindo música");
    }
    @Override
    public void pausar(){
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica(String Musica) {
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para o número");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página");

    }

    @Override
    public void adiconarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");

    }
}
