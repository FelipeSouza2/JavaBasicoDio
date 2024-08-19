public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligarNumero(String numero) {
        System.out.println("Ligando para "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendido"); 
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando música "+musica);
    }

}
