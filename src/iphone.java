public class iphone implements reprodutorMusical, telefone, internet {

    // Métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música em seu Iphone.\n");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada em seu Iphone.\n");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música em seu Iphone: " + musica + "\n");
    }

    // Métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do Navegador Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
