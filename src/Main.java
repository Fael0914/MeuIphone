import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       iphone meuIphone = new iphone();
       var option = -1;
       while(option != 0){
           System.out.println("Digite a opção em seu Iphone:");
           System.out.println("1. Reprodutor Musical");
           System.out.println("2. Telefone");
           System.out.println("3. Internet");
           System.out.println("4. Sair");
           option = leia.nextInt();
           switch (option){
               case 1:
                   System.out.println("[1] Tocar Musica");
                   System.out.println("[2] Pausar Musica");
                   System.out.println("[3] Escolher Musica");
                   int acaoMusica = leia.nextInt();
                   if(acaoMusica == 1){
                       meuIphone.tocar();
                   }else if(acaoMusica == 2){
                       meuIphone.pausar();
                   } else if (acaoMusica== 3) {
                       System.out.println("Digite o nome da musica:");
                       var nomeMusica = leia.next();
                       meuIphone.selecionarMusica(nomeMusica);

                   }break;
               case 2:
                   System.out.println("[1] Ligar ");
                   System.out.println("[2] Atender ");
                   System.out.println("[3] Iniciar Correio De Voz ");
                   int acaoTelefone = leia.nextInt();
                   if(acaoTelefone == 1){
                       System.out.println("Digite o numero:");
                       var numeroTelefone = leia.next();
                       meuIphone.ligar(numeroTelefone);
                   }else if(acaoTelefone == 2){
                       meuIphone.atender();
                   } else if (acaoTelefone == 3){
                       meuIphone.iniciarCorreioVoz();

                   }break;
               case 3:
                   System.out.println("[1] Exibir Nova Pagina");
                   System.out.println("[2] Adicionar Nova Aba");
                   System.out.println("[3] Atualizar Pagina");
                   var acaointernet = leia.nextInt();
                   if(acaointernet == 1){
                       System.out.println("Digite a URL:");
                       var url = leia.next();
                       meuIphone.exibirPagina(url);
                   } else if (acaointernet == 2) {
                       meuIphone.adicionarNovaAba();
                   }else if(acaointernet == 3){
                       meuIphone.atualizarPagina();
                   }break;
               case 0:
                   System.out.println("Encerrando o Programa...");
               default: System.out.println("Opção invalida");

           }
       }
    }
}
