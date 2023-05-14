import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Jogo {
    static String timeAtual;
    static String clubeAtual;
    static String clubeSorteado;
    static int pontuacaoJogador = 0;
    static Scanner sc = new Scanner(System.in);

    public static void tecleParaContinuar(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Tecle enter para continuar...");
        System.out.println("=============================");
        try {
        System. in.read();
        sc.nextLine();}
        catch (Exception e){
        }
    }
  public static void main(String[] args) throws InterruptedException {

    int escolha;
    do {
      System.out.println("@________________________________@"); // MENU DO JOGO
      System.out.println("|  @__________________________@  |");
      System.out.println("|  |  ***      ****      ***  |  |");
      System.out.println("|  | * FOOTBALL CAREER JAVA * |  |");
      System.out.println("|  |--------------------------|  |");
      System.out.println("|  |        1 - JOGAR         |  |");
      System.out.println("|  |      2 - INSTRUÇÕES      |  |");
      System.out.println("|  |       3 - CRÉDITOS       |  |");
      System.out.println("|  |         4 - SAIR         |  |");
      System.out.println("|  |__________________________|  |");
      System.out.println("@________________________________@");
      System.out.print("\n Escolha uma opção: ");
      escolha = sc.nextInt();
      
      switch (escolha) {
        case 1:
          System.out.println("Vamos iniciar sua jornada como jogador profissional!!");
          Jogar();
          break;
        case 2:
          System.out.println(
              "Você será testado com perguntas gerais sobre futebol. Cada fase do jogo conta com uma pontuação mínima necessária para avançar.");
          System.out.println(
              "- Na 1° Fase, o jogo conta com uma pergunta inicial apenas para definir seu clube e região, que não será contabilizada no resultado final de cada fase");

          System.out.println("- O jogador será testado com 5 perguntas, que valem 20 pontos cada. Ele deve conseguir no MÍNIMO 60 pontos para avançar para a 2° fase.");
          System.out.println("- Além da pontuação exigida, o jogador deve OBRIGATORIAMENTE acertar a pergunta final.");
          System.out.println("- Caso o jogador não atinja a pontuação mínima, ele deverá refazer a 1° fase.");
          tecleParaContinuar();
          break;
        case 3:
          System.out.println(
              "Jogo desenvolvido pelos alunos do 1° semestre de ADS: Jefferson Cavalcante / Gabriel Lomba / Lucas Gouveia / Vitor Cobeio.");
          tecleParaContinuar();
          break;
        case 4:
          System.out.println("Você saiu do jogo!");
          break;
        default:
          System.out.println(">> Opção Inválida <<");
          break;
      }

    } while (escolha != 4);

  }

  public static String textFaseUm() {
    StringBuilder sb = new StringBuilder();
    System.out.println("||||||||||    ||||||||     |||||||||||   |||||||||||               ||  ");  
    System.out.println("||           ||      ||    ||            ||                      | ||    ");
    System.out.println("|||||||      ||      ||    ||||||||||    |||||||||                 ||     ");      
    System.out.println("||           ||||||||||            ||    ||                        ||  ");           
    System.out.println("||           ||      ||    ||||||||||    |||||||||||    ||     ||||||||||\n"); 
    return sb.toString();
 }

 public static String textFaseDois() {
  StringBuilder sb = new StringBuilder();
  System.out.println("||||||||||    ||||||||     |||||||||||   |||||||||||           ||||||||||");
  System.out.println("||           ||      ||    ||            ||                            ||");
  System.out.println("|||||||      ||      ||    ||||||||||    |||||||||             ||||||||||");
  System.out.println("||           ||||||||||            ||    ||                    ||       ");
  System.out.println("||           ||      ||    ||||||||||    |||||||||||    ||     ||||||||||\n");
  return sb.toString();
}

public static String textFaseTres() {
  StringBuilder sb = new StringBuilder();
  System.out.println("||||||||||    ||||||||     |||||||||||   |||||||||||           ||||||||||");
  System.out.println("||           ||      ||    ||            ||                            ||");
  System.out.println("|||||||      ||      ||    ||||||||||    |||||||||             ||||||||||");
  System.out.println("||           ||||||||||            ||    ||                            ||");
  System.out.println("||           ||      ||    ||||||||||    |||||||||||    ||     ||||||||||\n");
  return sb.toString();
}

public static String textFaseQuatro() {
  StringBuilder sb = new StringBuilder();
  System.out.println("||||||||||    ||||||||     |||||||||||   |||||||||||           ||      ||");
  System.out.println("||           ||      ||    ||            ||                    ||      ||");
  System.out.println("|||||||      ||      ||    ||||||||||    |||||||||             ||||||||||");
  System.out.println("||           ||||||||||            ||    ||                            ||");
  System.out.println("||           ||      ||    ||||||||||    |||||||||||    ||             ||\n");
  return sb.toString();
}

public static String textCopaDoMundo() {
  StringBuilder sb = new StringBuilder();
  System.out.println("||||||||| ||||||||||  ||||||||   |||||||        |||||||   |||||||||        ||    ||   ||   ||  ||||   |  |||||||    |||||||||");
  System.out.println("||        ||      ||  ||    ||  ||     ||       ||    ||| ||     ||        ||||||||   ||   ||  || ||  |  ||    |||  ||     ||");
  System.out.println("||        ||      ||  ||||||||  ||     ||       ||    ||| ||     ||        || || ||   ||   ||  ||  || |  ||    |||  ||     ||");
  System.out.println("||        ||      ||  ||        |||||||||       ||    ||| ||     ||        ||    ||   ||   ||  ||   |||  ||    |||  ||     ||");
  System.out.println("||||||||  ||||||||||  ||        ||     ||       |||||||   |||||||||        ||    ||   |||||||  ||    ||  |||||||    |||||||||\n");
  return sb.toString();
}

  static void Jogar() throws InterruptedException {
    
    Random rd = new Random();

    System.out.printf("\nSeja muito bem vindo a...\n\n");
    Thread.sleep(3000); 
    textFaseUm(); 

    System.out.printf("\n\nO primeiro passo é escolher a região onde deseja iniciar sua carreira.");
    System.out.printf("\nOpções:\nNordeste / Sudeste / Sul");
    System.out.println("\n\nAntes, você precisa mostrar o seu conhecimento em futebol, com questões de múltipla escolha.\nSe acertar terá direito de escolher a região e o clube.\nSe errar o jogo irá fazer um sorteio para você.\n");
    Thread.sleep(3000);
    
    System.out.print("----------------------------------------------------------------------------------------------------------");

    System.out.println("\nQual time da EUROPA possui o maior número de títulos da Champions League?");
    System.out.println("a) Real Madrid\nb) Bayern de Munique\nc) Barcelona\nd) Milan"); // Real Madrid
    System.out.print("Sua opção: ");
    char respostaPerguntaEscolhaDoTime = sc.next().toUpperCase().charAt(0);

    String[] regioes = new String[] {
        "Nordeste", "Sudeste", "Sul"
    };
    String[] clubesNordeste = new String[] { // VETOR NORDESTE
        "Fortaleza", "Sport", "Ceará"
    };
    String[] clubesSudeste = new String[] { // VETOR SUDESTE
        "Ituano", "Agua Santa", "Mirassol"
    };
    String[] clubesSul = new String[] { // VETOR SUL
        "Chapecoense", "Criciúma", "Avaí"
    };

    switch (respostaPerguntaEscolhaDoTime) {
      case 'A':
        System.out.println("Resposta correta!\n");
        System.out.println("Opções disponíveis: ");

        String escolhaRegiao = "0";
        if (respostaPerguntaEscolhaDoTime == 'A') {
          int indiceRegiao = 1;
          for (String regiao : regioes) {
            System.out.println(indiceRegiao + ") " + regiao);
            indiceRegiao += 1;
          }
          System.out.print("Escolha uma região: ");
          escolhaRegiao = sc.next();

          while (true) {
            if (escolhaRegiao.equals("1") || escolhaRegiao.equals("2") || escolhaRegiao.equals("3")) {
              break;
            }  
            
            else {
              System.out.print("Opção inválida. Digite novamente.");
              escolhaRegiao = sc.next();
            }
          }
          System.out.println("Você escolheu a região: " + regioes[Integer.parseInt(escolhaRegiao) - 1] + "\n");
        }

        if (escolhaRegiao.equals("1")) { // ******ESCOLHA NORDESTE*******
          int indiceClube = 1;
          for (String clube : clubesNordeste) {
            System.out.println(indiceClube + ") " + clube);
            indiceClube += 1;

          }

          System.out.print("Escolha seu clube: ");
          String escolhaClube = sc.next();
          while (true) {
            if (escolhaClube.equals("1")){
                clubeAtual = clubesNordeste[Integer.parseInt(escolhaClube) - 1];
                break;
            } 

            if(escolhaClube.equals("2")){
                clubeAtual = clubesNordeste[Integer.parseInt(escolhaClube) - 1];
                break;
            }

            if(escolhaClube.equals("3")){
                clubeAtual = clubesNordeste[Integer.parseInt(escolhaClube) - 1];
                break;
            }
               
            else {
              System.out.print("Opção Inválida. Digite Novamente:");
              escolhaClube = sc.next();
            }
          }
          System.out.println("\nParabéns!! Você se tornou o novo jogador do " + clubeAtual + " !!" );
          break;
          } 

        if (escolhaRegiao.equals("2")) { // ******ESCOLHA SUDESTE*******
          int indiceClube1 = 1;
          for (String clube1 : clubesSudeste) {
            System.out.println(indiceClube1 + ") " + clube1);
            indiceClube1 += 1;
          }

          System.out.print("Escolha seu clube: ");
          String escolhaClubeSudeste = sc.next();
          while (true) {
            if (escolhaClubeSudeste.equals("1")){
              clubeAtual = clubesSudeste[Integer.parseInt(escolhaClubeSudeste) - 1];
              break;
          } 

          if(escolhaClubeSudeste.equals("2")){
              clubeAtual = clubesSudeste[Integer.parseInt(escolhaClubeSudeste) - 1];
              break;
          }

          if(escolhaClubeSudeste.equals("3")){
              clubeAtual = clubesSudeste[Integer.parseInt(escolhaClubeSudeste) - 1];
              break;
          }
            
            else {
              System.out.print(("Opção Inválida. Digite Novamente:"));
              escolhaClubeSudeste = sc.next();
            }
          }

          System.out.println("\nParabéns!! Você se tornou o novo jogador do " + clubeAtual + " !!");
          break;
          } 
        
          if (escolhaRegiao.equals("3")) { // *****ESCOLHA SUL******
          int indiceClube2 = 1;
          for (String clube2 : clubesSul) {
            System.out.println(indiceClube2 + ") " + clube2);
            indiceClube2 += 1;
          }

          System.out.print("Escolha seu clube: ");
          String escolhaClubeSul = sc.next();
          while (true) {
            if (escolhaClubeSul.equals("1")){
              clubeAtual = clubesSul[Integer.parseInt(escolhaClubeSul) - 1];
              break;
          } 

          if(escolhaClubeSul.equals("2")){
              clubeAtual = clubesSul[Integer.parseInt(escolhaClubeSul) - 1];
              break;
          }

          if(escolhaClubeSul.equals("3")){
              clubeAtual = clubesSul[Integer.parseInt(escolhaClubeSul) - 1];
              break;
          }
            
          else {
              System.out.print(("Opção Inválida. Digite Novamente:"));
              escolhaClubeSul = sc.next();
            }
          }
          System.out.println("\nParabéns!! Você se tornou o novo jogador do " + clubeAtual + " !!");
          break;
          }

      case 'B': 
      case 'C':
      case 'D':
        System.out.println("Resposta Incorreta!");
        System.out.println("O jogo irá sortear uma região para você.");
        String regiaoSorteada;

        regiaoSorteada = regioes[rd.nextInt(regioes.length)];
        System.out.println("Sua região sorteada foi: " + regiaoSorteada);

        System.out.println("\nAgora, o seu time será sorteado.");
        String clubeSorteado;
        if (regiaoSorteada == regioes[0]){
          clubeSorteado = clubesNordeste[rd.nextInt(clubesNordeste.length)];
          System.out.println("O time sorteado foi: " + clubeSorteado);
          clubeAtual = clubeSorteado;
        }

        else if (regiaoSorteada == regioes[1]){
          clubeSorteado = clubesSudeste[rd.nextInt(clubesSudeste.length)];
          System.out.println("O time sorteado foi: " + clubeSorteado);
          clubeAtual = clubeSorteado;
        }

        else if (regiaoSorteada == regioes[2]){
          clubeSorteado = clubesSul[rd.nextInt(clubesSul.length)];
          System.out.println("O time sorteado foi: " + clubeSorteado);
          clubeAtual = clubeSorteado;
        }
    }

    if (clubeAtual == clubesNordeste[0] || clubeAtual == clubesNordeste[1] || clubeAtual == clubesNordeste[2]){

      System.out.println("\nVocê chegou em um ótimo momento, seu clube está disputando a Copa do Nordeste, e sua chegada será de grande ajuda!");

          if(clubeAtual == clubesNordeste[0] || clubeSorteado == clubesNordeste[0]){
            System.out.println("O " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
            Thread.sleep(3000);
          }
          if(clubeAtual == clubesNordeste[1] || clubeSorteado == clubesNordeste[1]){
            System.out.println( "O " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
            Thread.sleep(3000);
          }
          if(clubeAtual == clubesNordeste[2] || clubeSorteado == clubesNordeste[2]){
            System.out.println("O " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
            Thread.sleep(3000);
          }
      
      System.out.println("Para garantir um bom resultado para o seu time, e avançar no mata-mata, você deve acertar as perguntas.");
      Thread.sleep(2000);
      System.out.print("----------------------------------------------------------------------------------------------------------");
      System.out.println("\n1ª Pergunta\nQual é o maior campeão da Copa do Nordeste?.");
      System.out.println("a) Fortaleza\nb) Bahia\nc) Sport\nd) Ceara"); // Bahia
      System.out.print("Sua Resposta: ");
        char respostaPerguntaUm;
      do{
      respostaPerguntaUm = sc.next().toUpperCase().charAt(0);
      
      switch (respostaPerguntaUm) {
        case 'B':
          System.out.println("Resposta Correta!!\n\nVocê garantiu 20 pontos de Progresso, e teve um ótimo desempenho, marcando 2 gols na sua estreia.\nNão é todo dia que um estreante faz isso.");
          pontuacaoJogador += 20;
          Thread.sleep(2000);
          break;
        case 'A':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.\n\nVocê teve um mal desempenho no seu primeiro jogo, e seu time acabou sendo derrotado.");
          Thread.sleep(2000);
          break;
        default:
        System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaUm != 'A' && respostaPerguntaUm != 'B' && respostaPerguntaUm != 'C' && respostaPerguntaUm != 'D');

      System.out.println("\nO " + clubeAtual + " tem outro grande desafio pela frente, e você precisa mostrar seu talento para a torcida, e justificar a escolha do técnico.");
      System.out.print("----------------------------------------------------------------------------------------------------------");
      Thread.sleep(3000);

      System.out.println("\n2ª Pergunta\nEm que ano o jogador Lionel Messi ganhou seu primeiro prêmio de Melhor do Mundo?");
      System.out.println("a) 2008\nb) 2011\nc) 2009\nd) 2010"); // 2009
      System.out.print("Sua Resposta: ");
        char respostaPerguntaDois;

        do{
      respostaPerguntaDois = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaDois) {
        case 'C':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'B':
        case 'D':
          System.out.println("Resposta Incorreta.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaDois != 'A' && respostaPerguntaDois != 'B' && respostaPerguntaDois != 'C'&& respostaPerguntaDois != 'D');

      System.out.println("\nVocê está avançando no campeonato. Será que seu desempenho está agradando a torcida do " + clubeAtual + " ?\nSe prepare para o próximo confronto contra o ABC, pela semi-final.");
      Thread.sleep(3000);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\n3ª Pergunta\nQuando foi realizada a primeira edição da Copa do Mundo?");
      System.out.println("a) 1930 - Uruguai\nb) 1926 - Itália\nc) 1950 - Alemanha\nd) 1942 - México"); // 1930 Uruguai
      System.out.print("Sua Resposta: ");
        char respostaPerguntaTres;

        do{
      respostaPerguntaTres = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaTres) {
        case 'A':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'B':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.\nO técnico esperava muito mais de você nessa Semi-final.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaTres != 'A' && respostaPerguntaTres != 'B' && respostaPerguntaTres != 'C' && respostaPerguntaTres != 'D');

      if(pontuacaoJogador < 20){
        System.out.println("\nVocê não está desempenhando bem...\nA torcida e técnico do " + clubeAtual + "estão cobrando um desempenho melhor.\nVocê precisa dar tudo de si para limpar sua imagem com o clube.\nTreine bastante, o próximo jogo é a grande final.");
        Thread.sleep(3000);
      }
      else if(pontuacaoJogador == 20){
        System.out.println("\nVocê desperdiçou algumas boas chances nos últimos jogos, mas, o técnico está disposto a manter a sua titularidade para a final.");
        Thread.sleep(3000);
      }

      else{
        System.out.println("\nVocê está dominando os adversários, e é o maior goleador do campeonato.\nO técnico em uma coletiva de impresa, disse nunca ter visto um jovem com um talento desses..\nSerá incrível assití-lo na final..");
        Thread.sleep(3000);
      }

      System.out.println("\nVocê está na final do campeonato. Chegou a hora de fazer história pelo " + clubeAtual + ". Boa sorte!!");
      Thread.sleep(3000);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\n4ª Pergunta\nQual foi o adversário da Seleção Brasileira na sua primeira final de Copa?");
      System.out.println("a) Espanha\nb) Alemanha\nc) Argentina\nd) Uruguai"); // Uruguai
      System.out.print("Sua Resposta: ");
        char respostaPerguntaQuatro;

        do{
      respostaPerguntaQuatro = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaQuatro) {
        case 'D':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'B':
        case 'C':
          System.out.println("Resposta Incorreta.");
          System.out.println("Você perdeu muitas chances no primeiro tempo e está sendo vaiado pela torcida. Cuidado para isso não tirar o seu foco.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaQuatro != 'A' && respostaPerguntaQuatro != 'B' && respostaPerguntaQuatro != 'C' && respostaPerguntaQuatro != 'D');

      if(pontuacaoJogador == 40){
        System.out.println("\nSeu time está na final do campeonato, e saiu perdendo no primeiro tempo por 2 x 0.\nO segundo tempo será o tudo ou nada, você precisa dar o seu máximo para alcançar o título da Copa do Nordeste.");
        Thread.sleep(3000);
      }

      else if(pontuacaoJogador >= 60){
        System.out.println("\nO " + clubeAtual + " está goleando o adversário na final, graças ao seu desempenho de gala.\nCom certeza muitos clubes estão de olho no seu jovem talento..");
        Thread.sleep(3000);
      }

      else {
        System.out.println("\nVocê está desempenhando muito mal..\nO " + clubeAtual + " está sendo goleado na final, e você está totalmente perdido em campo.");
        Thread.sleep(3000);
      }

      System.out.println("\nSe prepare para a última pergunta..Seu futuro será decidido aqui!");
      Thread.sleep(2500);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\nPergunta Final\nQuantos Hat-Tricks, o jogador Cristiano Ronaldo possuí em sua carreira?");
      System.out.println("a) 63\nb) 61\nc) 40\nd) 49");// 61
      System.out.printf("Sua resposta: ");
        char respostaPerguntaFinal;

        do{
      respostaPerguntaFinal = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaFinal) {
        case 'B':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaFinal != 'A' && respostaPerguntaFinal != 'B' && respostaPerguntaFinal != 'C' && respostaPerguntaFinal != 'D');

      if(respostaPerguntaFinal == 'B' && pontuacaoJogador > 60){
      System.out.println("\nVOCÊ É DEMAIS!! Você não sentiu a pressão da final, e fez um hat-trick pra cima do adversário.\nAlém disso do título, você foi premiado como melhor jogador do torneio. PARABÉNS!!");
      Thread.sleep(5000);
      }

      else if(respostaPerguntaFinal == 'B' && pontuacaoJogador == 60){
        System.out.println("\nHISTÓRICO!! Você jogou muito bem e o " + clubeAtual + " concretizou uma das maiores viradas que já vimos.");
        Thread.sleep(5000);
      }

      else{ 
        System.out.println("\nQUE DECEPÇÃO.. O " + clubeAtual + " depositou muita confiança em você para alcançar esse título, e você não entregou o que era necessário.");
        Thread.sleep(3000);
      } 

      System.out.printf("\nVocê chegou ao final da fase 1.\nSua pontuação foi de: %d pontos\n", pontuacaoJogador);
      if(pontuacaoJogador >= 60){
        System.out.println("\nVocê foi muito bem nessa primeira etapa e avançou para a...\n");
        Thread.sleep(3000);
            textFaseDois();   
            Thread.sleep(3000);         
            Fase2();
      }

      else{
        System.out.println("\nVocê não atingiu a pontuação miníma para avançar de fase. Tente se esforçar mais da próxima vez.");
        System.exit(0);
      }

      }// BLOCO DE CÓDIGO DOS TIMES REGIÃO 1 (NORDESTE)
  
    if (clubeAtual == clubesSudeste[0] || clubeAtual == clubesSudeste[1] || clubeAtual == clubesSudeste[2]){
      System.out.println("Você chegou em um ótimo momento, seu clube está disputando o Campeonato Paulista e sua chegada será de grande ajuda!");

        if (clubeAtual == clubesSudeste[0] || clubeSorteado == clubesSudeste[0]){
          System.out.printf("\nO " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
        } 
  
        else if (clubeAtual == clubesSudeste[1] || clubeSorteado == clubesSudeste[1]){
          System.out.printf("\nO " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
        } 
  
        else if (clubeAtual == clubesSudeste[2] || clubeSorteado == clubesSudeste[2]){
          System.out.printf("\nO " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
        }

      System.out.println("Para garantir um bom resultado para o seu time, e avançar no mata-mata, você deve acertar as perguntas.");
      Thread.sleep(2000);
      System.out.print("----------------------------------------------------------------------------------------------------------");
      System.out.println("\n1ª Pergunta\nQual é o maior campeão do Campeonato Paulista?.");
      System.out.println("a) São Paulo\nb) Palmeiras\nc) Corinthians\nd) Santos"); // Corinthians
      System.out.print("Sua Resposta: ");
        char respostaPerguntaUm;

        do{
          respostaPerguntaUm = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaUm) {
        case 'C':
          System.out.println("Resposta Correta!!\n\nVocê garantiu 20 pontos de Progresso, e teve um ótimo desempenho, marcando 2 gols na sua estreia.\nNão é todo dia que um estreante faz isso.");
          pontuacaoJogador += 20;
          Thread.sleep(2000);
          break;
        case 'A':
        case 'B':
        case 'D':
          System.out.println("Resposta Incorreta.\n\nVocê teve um mal desempenho no seu primeiro jogo, e seu time acabou sendo derrotado.");
          Thread.sleep(2000);
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaUm != 'A' && respostaPerguntaUm != 'B' && respostaPerguntaUm != 'C' && respostaPerguntaUm != 'D');

      System.out.println("\nO " + clubeAtual + " tem outro grande desafio pela frente, e você precisa mostrar seu talento para a torcida, e justificar a escolha do técnico.");
      System.out.print("----------------------------------------------------------------------------------------------------------");
      Thread.sleep(3000);

      System.out.println("\n2ª Pergunta\nQuem ganhou o prêmio de Melhor Jogador da Copa do Mundo de 2014??");
      System.out.println("a) Mário Goetze\nb) Sergio Aguero\nc) Lionel Messi\nd) Bastian Schweinsteiger"); // Lionel Messi
      System.out.print("Sua Resposta: ");
        char respostaPerguntaDois;

        do{
          respostaPerguntaDois = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaDois) {
        case 'C':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'B':
        case 'D':
          System.out.println("Resposta Incorreta.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaDois != 'A' && respostaPerguntaDois != 'B' && respostaPerguntaDois != 'C' && respostaPerguntaDois != 'D');

      System.out.println("\nVocê está avançando no campeonato. Será que seu desempenho está agradando a torcida do " + clubeAtual + " ?\nSe prepare para o próximo confronto contra o Bragantino, pela semi-final.");
      Thread.sleep(3000);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\n3ª Pergunta\nQual o maior campeão da Premier League?");
      System.out.println("a) Manchester United\nb) Liverpool\nc) Chelsea\nd) Manchester City"); // Man. United
      System.out.print("Sua Resposta: ");
        char respostaPerguntaTres;

        do{
          respostaPerguntaTres = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaTres) {
        case 'A':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'B':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.\nO técnico esperava muito mais de você nessa Semi-final.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaTres != 'A' && respostaPerguntaTres != 'B' && respostaPerguntaTres != 'C' && respostaPerguntaTres != 'D');

      if(pontuacaoJogador < 20){
        System.out.println("\nVocê não está desempenhando bem...\nA torcida e técnico do " + clubeAtual + "estão cobrando um desempenho melhor.\nVocê precisa dar tudo de si para limpar sua imagem com o clube.\nTreine bastante, o próximo jogo é a grande final.");
        Thread.sleep(3000);
      }

      else if(pontuacaoJogador == 20){
        System.out.println("\nVocê desperdiçou algumas boas chances nos últimos jogos, mas, o técnico está disposto a manter a sua titularidade para a final.");
        Thread.sleep(3000);
      }

      else{
        System.out.println("\nVocê está dominando os adversários, e é o maior goleador do campeonato.\nO técnico em uma coletiva de impresa, disse nunca ter visto um jovem com um talento desses..\nSerá incrível assití-lo na final..");
        Thread.sleep(3000);
      }

      System.out.println("\nVocê está na final do campeonato. Chegou a hora de fazer história pelo " + clubeAtual + ". Boa sorte!!");
      Thread.sleep(3000);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\n4ª Pergunta\nQual o maior artilheiro da Premier League?");
      System.out.println("a) Sergio Agüero\nb) Cristiano Ronaldo\nc) Alan Shearer\nd) Steven Gerrard"); // Alan Shearer
      System.out.print("Sua Resposta: ");
        char respostaPerguntaQuatro;

        do{
          respostaPerguntaQuatro = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaQuatro) {
        case 'C':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'B':
        case 'D':
          System.out.println("Resposta Incorreta.");
          System.out.println("Você perdeu muitas chances no primeiro tempo e está sendo vaiado pela torcida. Cuidado para isso não tirar o seu foco.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaQuatro != 'A' && respostaPerguntaQuatro != 'B' && respostaPerguntaQuatro != 'C' && respostaPerguntaQuatro != 'D');

      if(pontuacaoJogador == 40){
        System.out.println("\nSeu time está na final do campeonato, e saiu perdendo no primeiro tempo por 2 x 0.\nO segundo tempo será o tudo ou nada, você precisa dar o seu máximo para alcançar o título do Campeonato Paulista.");
        Thread.sleep(3000);
      }

      else if(pontuacaoJogador >= 60){
        System.out.println("\nO " + clubeAtual + " está goleando o adversário na final, graças ao seu desempenho de gala.\nCom certeza muitos clubes estão de olho no seu jovem talento..");
        Thread.sleep(3000);
      }

      else {
        System.out.println("\nVocê está desempenhando muito mal..\nO " + clubeAtual + " está sendo goleado na final, e você está totalmente perdido em campo.");
        Thread.sleep(3000);
      }

      System.out.println("\nSe prepare para a última pergunta..Seu futuro será decidido aqui!");
      Thread.sleep(2500);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\nPergunta Final\nEm que ano, a Liga Inglesa passou a se chamar Premier League?");
      System.out.println("a) 2013\nb) 1992\nc) 2001\nd) 1995");// 1992
      System.out.printf("Sua Resposta: ");
        char respostaPerguntaFinal;

        do{
      respostaPerguntaFinal = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaFinal) {
        case 'B':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaFinal != 'A' && respostaPerguntaFinal != 'B' && respostaPerguntaFinal != 'C' && respostaPerguntaFinal != 'D');

      if(respostaPerguntaFinal == 'B' && pontuacaoJogador > 60){
      System.out.println("\nVOCÊ É DEMAIS!! Você não sentiu a pressão da final, e fez um hat-trick pra cima do adversário.\nAlém disso do título, você foi premiado como melhor jogador do torneio. PARABÉNS!!");
      Thread.sleep(5000);
      }

      else if(respostaPerguntaFinal == 'B' && pontuacaoJogador == 60){
        System.out.println("\nHISTÓRICO!! Você jogou muito bem e o " + clubeAtual + " concretizou uma das maiores viradas que já vimos.");
        Thread.sleep(5000);
      }

      else{ 
        System.out.println("\nQUE DECEPÇÃO.. O " + clubeAtual + " depositou muita confiança em você para alcançar esse título, e você não entregou o que era necessário.");
        Thread.sleep(3000);
      } 

      System.out.printf("\nVocê chegou ao final da fase 1.\nSua pontuação foi de: %d pontos\n", pontuacaoJogador);
      if(pontuacaoJogador >= 60){
        System.out.println("\nVocê foi muito bem nessa primeira etapa e avançou para a...\n");
        Thread.sleep(3000);
            textFaseDois();   
            Thread.sleep(3000);         
            Fase2();
      }

      else{
        System.out.println("\nVocê não atingiu a pontuação miníma para avançar de fase. Tente se esforçar mais da próxima vez.");
        System.exit(0);
      }
    } // BLOCO DE CÓDIGO DOS TIMES REGIÃO 2 (SUDESTE)
  
    if (clubeAtual == clubesSul[0] || clubeAtual == clubesSul[1] || clubeAtual == clubesSul[2]){
      System.out.println("Você chegou em um ótimo momento, seu clube está disputando o Campeonato Gaúcho e sua chegada será de grande ajuda!");

          if (clubeAtual == clubesSul[0] || clubeSorteado == clubesSul[0]){
            System.out.printf("\nA " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
          } 
          
          else if (clubeAtual == clubesSul[1] || clubeSorteado == clubesSul[1]){
            System.out.printf("\nO " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
          } 
          
          else if (clubeAtual == clubesSul[2] || clubeSorteado == clubesSul[2]){
            System.out.printf("\nO " + clubeAtual + " está na fase de mata-mata do campeonato, e você tem a chance de mostrar para que veio, e, por isso, será escalado como titular no primeiro jogo.\n");
      }

      System.out.println("Para garantir um bom resultado para o seu time, e avançar no mata-mata, você deve acertar as perguntas.");
      Thread.sleep(2000);
      System.out.print("----------------------------------------------------------------------------------------------------------");
      System.out.println("\n1ª Pergunta\nQual é o maior campeão do Campeonato Gaúcho?.");
      System.out.println("a) Juventude\nb) Internacional\nc) Grêmio\nd) Caxias do Sul"); // Gremio
      System.out.print("Sua Resposta: ");
        char respostaPerguntaUm;

        do{
          respostaPerguntaUm = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaUm) {
        case 'C':
          System.out.println("Resposta Correta!!\n\nVocê garantiu 20 pontos de Progresso, e teve um ótimo desempenho, marcando 2 gols na sua estreia.\nNão é todo dia que um estreante faz isso.");
          pontuacaoJogador += 20;
          Thread.sleep(2000);
          break;
        case 'A':
        case 'B':
        case 'D':
          System.out.println("Resposta Incorreta.\n\nVocê teve um mal desempenho no seu primeiro jogo, e seu time acabou sendo derrotado.");
          Thread.sleep(2000);
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaUm != 'A' && respostaPerguntaUm != 'B' && respostaPerguntaUm != 'C' && respostaPerguntaUm != 'D');

      System.out.println("\nO " + clubeAtual + " tem outro grande desafio pela frente, e você precisa mostrar seu talento para a torcida, e justificar a escolha do técnico.");
      System.out.print("----------------------------------------------------------------------------------------------------------");
      Thread.sleep(3000);

      System.out.println("\n2ª Pergunta\nQuantos títulos da LaLiga tem o Real Madrid?");
      System.out.println("a) 35\nb) 40\nc) 31\nd) 39"); // 35
      System.out.print("Sua Resposta: ");
        char respostaPerguntaDois;
        
        do{
          respostaPerguntaDois = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaDois) {
        case 'A':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'B':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaDois != 'A' && respostaPerguntaDois != 'B' && respostaPerguntaDois != 'C' && respostaPerguntaDois != 'D');

      System.out.println("\nVocê está avançando no campeonato. Será que seu desempenho está agradando a torcida do " + clubeAtual + " ?\nSe prepare para o próximo confronto contra o Maringá, pela semi-final.");
      Thread.sleep(3000);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\n3ª Pergunta\nQuando a LaLiga foi criada?");
      System.out.println("a) 1935\nb) 1929\nc) 1950\nd) 1963"); // 1929
      System.out.print("Sua Resposta: ");
        char respostaPerguntaTres;

        do{
          respostaPerguntaTres = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaTres) {
        case 'B':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.\nO técnico esperava muito mais de você nessa Semi-final.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaTres != 'A' && respostaPerguntaTres != 'B' && respostaPerguntaTres != 'C' && respostaPerguntaTres != 'D');

      if(pontuacaoJogador < 20){
        System.out.println("\nVocê não está desempenhando bem...\nA torcida e técnico do " + clubeAtual + "estão cobrando um desempenho melhor.\nVocê precisa dar tudo de si para limpar sua imagem com o clube.\nTreine bastante, o próximo jogo é a grande final.");
        Thread.sleep(3000);
      }

      else if(pontuacaoJogador == 20){
        System.out.println("\nVocê desperdiçou algumas boas chances nos últimos jogos, mas, o técnico está disposto a manter a sua titularidade para a final.");
        Thread.sleep(3000);
      }

      else{
        System.out.println("\nVocê está dominando os adversários, e é o maior goleador do campeonato.\nO técnico em uma coletiva de impresa, disse nunca ter visto um jovem com um talento desses..\nSerá incrível assití-lo na final..");
        Thread.sleep(3000);
      }

      System.out.println("\nVocê está na final do campeonato. Chegou a hora de fazer história pelo " + clubeAtual + ". Boa sorte!!");
      Thread.sleep(3000);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\n4ª Pergunta\nA quem pertence o recorde da mais gols em uma edição de LaLiga?");
      System.out.println("a) Karim Benzema\nb) Cristiano Ronaldo\nc) Luís Suarez\nd) Lionel Messi"); // Lionel Messi
      System.out.print("Sua Resposta: ");
        char respostaPerguntaQuatro;

        do{
          respostaPerguntaQuatro = sc.next().toUpperCase().charAt(0);
          switch (respostaPerguntaQuatro) {
          case 'D':
            System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
            pontuacaoJogador += 20;
            break;
          case 'A':
          case 'B':
          case 'C':
            System.out.println("Resposta Incorreta.");
            System.out.println("Você perdeu muitas chances no primeiro tempo e está sendo vaiado pela torcida. Cuidado para isso não tirar o seu foco.");
            break;
            default:
            System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaQuatro != 'A' && respostaPerguntaQuatro != 'B' && respostaPerguntaQuatro != 'C' && respostaPerguntaQuatro != 'D');

      if(pontuacaoJogador == 40){
        System.out.println("\nSeu time está na final do campeonato, e saiu perdendo no primeiro tempo por 2 x 0.\nO segundo tempo será o tudo ou nada, você precisa dar o seu máximo para alcançar o título do Campeonato Gaúcho");
        Thread.sleep(3000);
      }

      else if(pontuacaoJogador >= 60){
        System.out.println("\nO " + clubeAtual + " está goleando o adversário na final, graças ao seu desempenho de gala.\nCom certeza muitos clubes estão de olho no seu jovem talento..");
        Thread.sleep(3000);
      }

      else {
        System.out.println("\nVocê está desempenhando muito mal..\nO " + clubeAtual + " está sendo goleado na final, e você está totalmente perdido em campo.");
        Thread.sleep(3000);
      }

      System.out.println("\nSe prepare para a última pergunta..Seu futuro será decidido aqui!");
      Thread.sleep(2500);
      System.out.print("----------------------------------------------------------------------------------------------------------");

      System.out.println("\nPergunta Final\nQuem é o jogador que mais ganhou títulos da LaLiga?");
      System.out.println("a) Lionel Messi\nb) Paco Gento\nc) Carles Puyol\nd) Daniel Alves");// Paco Gento
      System.out.printf("Sua Resposta: ");
        char respostaPerguntaFinal;

        do{
      respostaPerguntaFinal = sc.next().toUpperCase().charAt(0);
      switch (respostaPerguntaFinal) {
        case 'B':
          System.out.println("Resposta Correta!! + 20 Pontos de Progresso");
          pontuacaoJogador += 20;
          break;
        case 'A':
        case 'C':
        case 'D':
          System.out.println("Resposta Incorreta.");
          break;
          default:
          System.out.print("Opção Inválida. Digite novamente: ");
      }
    } while(respostaPerguntaFinal != 'A' && respostaPerguntaFinal != 'B' && respostaPerguntaFinal != 'C' && respostaPerguntaFinal != 'D');

      if(respostaPerguntaFinal == 'B' && pontuacaoJogador > 60){
      System.out.println("\nVOCÊ É DEMAIS!! Você não sentiu a pressão da final, e fez um hat-trick pra cima do adversário.\nAlém disso do título, você foi premiado como melhor jogador do torneio. PARABÉNS!!");
      Thread.sleep(5000);
      }

      else if(respostaPerguntaFinal == 'B' && pontuacaoJogador == 60){
        System.out.println("\nHISTÓRICO!! Você jogou muito bem e o " + clubeAtual + " concretizou uma das maiores viradas que já vimos.");
        Thread.sleep(5000);
      }

      else{ 
        System.out.println("\nQUE DECEPÇÃO.. O " + clubeAtual + " depositou muita confiança em você para alcançar esse título, e você não entregou o que era necessário.");
        Thread.sleep(3000);
      } 

      System.out.printf("\nVocê chegou ao final da fase 1.\nSua pontuação foi de: %d pontos\n", pontuacaoJogador);
      if(pontuacaoJogador >= 60){
        System.out.println("\nVocê foi muito bem nessa primeira etapa e avançou para a...\n");
        Thread.sleep(3000);
            textFaseDois();   
            Thread.sleep(3000);         
            Fase2();
      }

      else{
        System.out.println("\nVocê não atingiu a pontuação miníma para avançar de fase. Tente se esforçar mais da próxima vez.");
        System.exit(0);
      }
    } // BLOCO DE CÓDIGO TIMES REGIÃO 3 (SUL)
  } 



  static void Fase2()throws InterruptedException{
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    System.out.println("");
    System.out.println("");
    System.out.println("Você jogou muito bem na temporada passada e isso despertou o interesse de vários clubes grandes!");
    System.out.println("Estes clubes estão localizados nestas duas regiões: Sul e Sudeste.");
    System.out.println("\nAgora é com você! Escolha uma região e caso você acerte uma pergunta tem o direito de escolher o clube que deseja jogar!");

    System.out.println("1) Sul\n2) Sudeste");
    System.out.print("Sua escolha: ");
    String regiao = sc.nextLine();

    if (regiao.equals("1")) {
        System.out.println("Você escolheu a região: Sul.");
    } else if (regiao.equals("2")) {
        System.out.println("Você escolheu a região: Sudeste.");
    } else {
        while (true) { // se o usuário não escolher uma opção válida, ele cai nesse laço de repetição
            if (regiao.equals("1") || regiao.equals("2")) {
                if (regiao.equals("1")) {
                    System.out.println("Você escolheu a região: Sul.");
                    break;
                } else if (regiao.equals("2")) {
                    System.out.println("Você escolheu a região: Sudeste.");
                    break;
                }
            } else {
                System.out.print("Opção inválida. Digite novamente: ");
                regiao = sc.nextLine();
            }
        }
    }
    System.out.print("----------------------------------------------------------------------------------------------------------");
    System.out.println("\nQual o maior artilheiro da seleção brasileira?\na) Neymar\nb) Pelé\nc) Zico\nd) Romário");
    System.out.print("Sua resposta: ");
    String resposta = sc.nextLine().toUpperCase();
    while (true) {
        if (resposta.equals("a".toUpperCase()) || resposta.equals("b".toUpperCase()) || resposta.equals("c".toUpperCase()) || resposta.equals("d".toUpperCase())) {
            break;
        } else {
            System.out.print("Opção inválida. Digite novamente: ");
            resposta = sc.nextLine().toUpperCase();
        }
    }
    // armazenamneto de clubes em vetores
    String clubesSul[] = new String[] {
            "Grêmio", "Internacional"
    };

    String clubesSudeste[] = new String[] {
            "Atlético Mineiro", "Palmeiras"
    };
    String escolha;
    switch (resposta) {
        case "B":
            System.out.println("Resposta correta. Pelé tem 77 gols em 92 jogos.\n\nOpções disponíveis:");
            if (regiao.equals("1")) {
                int indiceClube = 1;
                // soma o indice do clube mais 1, desta forma apresentará o indice 0 como 1, para o usuário
                for (String clube : clubesSul) {
                    System.out.println(indiceClube + ") " + clube);
                    indiceClube += 1;
                }
                System.out.print("\nEscolha o time de sua preferência: ");
                escolha = sc.nextLine();
                while (true) {
                    if (escolha.equals("1") || escolha.equals("2")) {
                        if (escolha.equals("1")){
                            timeAtual = clubesSul[Integer.parseInt(escolha) - 1];
                        }
                        else if (escolha.equals("2")){
                            timeAtual = clubesSul[Integer.parseInt(escolha) - 1];
                        }
                        break;
                    } else {
                        System.out.print("Opção inválida. Digite novamente: ");
                        escolha = sc.nextLine();
                    }
                } 

                System.out.println("Parabéns! Você se tornou o novo jogador do " + timeAtual + ".");
            } 
            else if (regiao.equals("2")) {
                int indiceClube = 1;
                for (String clube : clubesSudeste) {
                    System.out.println(indiceClube + ") " + clube);
                    indiceClube += 1;
                }
                System.out.print("\nEscolha o time de sua preferência: ");
                escolha = sc.nextLine();
                while (true) {
                    if (escolha.equals("1") || escolha.equals("2")) {
                        if (escolha.equals("1")){
                            timeAtual = clubesSudeste[Integer.parseInt(escolha) - 1];
                        }
                        else if (escolha.equals("2")){
                            timeAtual = clubesSudeste[Integer.parseInt(escolha) - 1];
                        }
                        break;
                    } else {
                        System.out.print("Opção inválida. Digite novamente: ");
                        escolha = sc.nextLine();
                    }
                }
                System.out.printf("Parabéns! Você se tornou o novo jogador do %s.", timeAtual);
            }
            
            break;

        case "A":
        case "C":
        case "D":
            System.out.println("Resposta incorreta. Pelé tem 77 gols em 92 jogos.");
            
            if (regiao.equals("1")) {
                clubeSorteado = clubesSul[random.nextInt(clubesSul.length)]; //pega o valor escolhido e armazena numa variavel
                System.out.println("\nSeu time será sorteado. \nSeu clube sorteado foi: " + clubeSorteado);
                timeAtual = clubeSorteado;
            } else if (regiao.equals("2")) {
                clubeSorteado = clubesSudeste[random.nextInt(clubesSudeste.length)];
                System.out.println("\nSeu time será sorteado. \nSeu clube sorteado foi: " + clubeSorteado);
                timeAtual = clubeSorteado;
            }
            break;
    }
    int pontuaçao = 0;
    char pergunta1;
    System.out.println("\nAgora que definimos o seu novo time, vamos iniciar sua temporada!");
    System.out.println("\nVocê esta estreiando pelo " + timeAtual + " e irá enfrentar o Fortaleza pela primeira rodada do Brasileirão.");
    System.out.println("Mas antes de tudo, você deve acertar uma pergunta para ter a certeza que se sairá bem na sua estreia!");
    System.out.print("----------------------------------------------------------------------------------------------------------");
    System.out.println("\nQuem é o maior artilheiro da história do Brasileirão, na era dos ponto corridos?");
    System.out.println("a) Diego Souza");
    System.out.println("b) Gabigol");
    System.out.println("c) Roberto Dinamite");
    System.out.println("d) Luis Fabiano");
    System.out.print("Sua reposta: ");
    do{
    pergunta1 = sc.nextLine().toUpperCase().charAt(0);

    switch (pergunta1){
        case 'A':
        case 'B':
        case 'D':
            System.out.println("Resposta incorreta! O artilheiro foi Roberto Dinamite com 190 gols.");
            System.out.println("E por ter errado esta pergunta você acabou indo mal na estreia. Errando alguns passes e perdendo um gol.\nMas não desanime, você terá outras chances de mostrar o seu valor!");
            System.out.println("Sua pontução: " + pontuaçao);
            break;
        case 'C':
            System.out.println("Resposta correta!, Roberto Dinamite tem 190 gols.");
            System.out.println("QUE ESTREIA!! Você fez uma ótima partida, marcando um gol e dando duas belas assistências! Assim, ganhando moral com o clube!");
            pontuaçao += 20;
            System.out.println("Sua pontuação: " + pontuaçao);
            break;
        default:
            System.out.print("Opção inválida, digite novamente: ");
            break;
    }
    }while (pergunta1 != 'A' && pergunta1 != 'B' && pergunta1 != 'C' && pergunta1 != 'D' );
    
    Thread.sleep(3000);
    char pergunta2;
    
        System.out.println("\n\nAlém do Brasileirão, o " + timeAtual + " está disputando também a Libertadores.");
        System.out.println("Seu time ja avançou algumas fases, porém você não estava escrito anteriormente. Então hoje será a sua estreia! Esteja preparado.");

        System.out.println("Para garantir a vitória e o seu bom desempenho na partida, acerte a pergunta:");
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQual jogador tem mais hat-tricks (3 gols em um mesmo jogo) na carreira?\na) Luis Suarez\nb) Lionel Messi\nc) Cristiano Ronaldo\nd) Ronaldo Fenômeno");
        System.out.print("Sua resposta: ");
        do{
        pergunta2 = sc.nextLine().toUpperCase().charAt(0);

        switch(pergunta2){
            case 'A':
            case 'B':
            case 'D':
                System.out.println("Resposta incorreta! O jogador com hat-tricks é o Cristinao Ronaldo, com 61 marcos na carreira!");
                System.out.println("E assim, você acabou indo bem mal nesta partida e seu time foi eliminado. Parece até que você sentiu a pressão de jogar com o estádio lotado.");
                System.out.println("Sua pontução: " + pontuaçao);
                break;
            case 'C':
                System.out.println("Resposta correta!! Cristiano Ronaldo tem 61 hat-tricks na carreira.");
                System.out.println("Você foi simplesmente FANTÁSTICO!! Numa noite mágica de Libertadores, você marcou um hat-trick no jogo de ida das oitvas de final contra o Boca Juniors! QUE ESTREIA!");
                pontuaçao += 20;
                System.out.println("Sua pontução: " + pontuaçao);
                break;
            default:
                System.out.print("Opção inválida, digite novamente: ");
                break;
        }
    }while (pergunta2 != 'A' && pergunta2 != 'B' && pergunta2 != 'C' && pergunta2 != 'D');
    

    Thread.sleep(3000);
    char pergunta3;
    
        System.out.println("\n\nVocê está no meio do campeonato brasileiro e o " + timeAtual + " precisa de uma vitória para pegar a ponta da tabela.");
        System.out.println("O jogo é contra o líder Flamengo no Maracanã, este jogo terá uma pressão absurda, se ganharem este jogo se tornam favoritos ao título!");
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nO São Paulo é um clube multicampeão, nacionalmente e internacionalmente, e neste século fizeram o feito de serem campeões brasileiro 3 vezes seguidas. Quais foram estes anos?");
        System.out.println("a) 2005, 2006, 2007\nb) 2008, 2009, 2010\nc) 2007, 2008, 2009\nd) 2006, 2007, 2008");
        System.out.print("Sua resposta: ");
        do{
        pergunta3 = sc.next().toUpperCase().charAt(0);
        switch(pergunta3){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Resposta errada! A resposta correta seria a alternativa 'd'.");
                System.out.println("Com esta derrota as chances de título dimunuiram e o seu time perdeu uma chance de ouro. Parece que já existem alguns clubes europeus de olho na sua situação, porém você só terá uma oportunidade caso seu desempenho coletivo for bom.");
                System.out.println("Sua pontução: " + pontuaçao);
                break;
            case 'D':
                System.out.println("Resposta correta!!\nO " + timeAtual + " ganhou do Flamengo por 2 x 0, assumiu a ponta do campeonato e se tornou favoritíssimo ao título!");
                System.out.println("Muitos jornalistas estão comentando sobre sua temporada, ótimas atuações com gols e assistências estão despertando o interesse de vários clubes europeus, continue acertando as questões e terá uma otima carreira!");
                pontuaçao += 20;
                System.out.println("Sua pontução: " + pontuaçao);
                break;
            default:
                System.out.print("Opção inválida, digite novamente: ");
                break;
        }
    }while (pergunta3 != 'A' && pergunta3 != 'B' && pergunta3 != 'C' && pergunta3 != 'D');
    

    Thread.sleep(3000);
    char pergunta4 = '0';
    if(pergunta2 == 'C'){
        
            System.out.println("\n\nPerto do fim da temporada, o " + timeAtual + " tem um jogo importantíssimo, válido pela semifinal da Libertadores, num grande clássico contra o Corinthinas!!\nO jogo de ida foi 0 à 0 no casa do adversário. Mentenha o foco, vença a partida e avance para a final do campeonato.");
            System.out.print("----------------------------------------------------------------------------------------------------------");
            System.out.println("\nQual o primeiro time brasileiro a ganhar uma Libertadores?\na) Corinthians\nb) Santos\nc) Palmeiras\nd) Flamengo");
            System.out.print("Sua resposta: ");
            do{
            pergunta4 = sc.next().toUpperCase().charAt(0);
            switch (pergunta4){
                case 'A':
                case 'C':
                case 'D':
                    System.out.println("Reposta incorreta! O Santos foi o primeiro campeão.");
                    System.out.println("AH NÃO! O " + timeAtual + " teve um péssimo desempenho e perdeu para o Corinthians por 3x0. Assim sendo eliminado da Libertadores.");
                    System.out.println("Você jogou muito mal, o que está acontecendo? Mantenha o foco nas perguntas! A temporada ainda não está perdida.");
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                case 'B': 
                    System.out.println("Resposta correta!!\nHISTÓRICO! Com tão pouca idade você conseguiu levar o " + timeAtual + " à final da Libertadores com dois gols e uma assistência!!");
                    System.out.println("Podemos definitivamente dizer que você é craque!");
                    pontuaçao += 20;
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                default: 
                    System.out.print("Opção inválida, digite novamente: ");
                    break;
            }
        }while (pergunta1 != 'A' && pergunta1 != 'B' && pergunta1 != 'C' && pergunta1 != 'D');
    }
    
    
    Thread.sleep(3000);
    char pergunta5;
    if (pergunta3 =='D'){
        
            System.out.println("\n\nHoje é a útilma rodada do Brasileirão e o " + timeAtual +  " só não pode perder para conquistar o Brasileirão, vença a partida e conquiste este título.\nAlém disso, você está disputandoa a artilharia do campeonato com o Gabigol, do Flamengo. Você vai precisar de dois gols para ultrapassá-lo.");
            System.out.print("----------------------------------------------------------------------------------------------------------");
            System.out.println("\nUm dos Brasileirões mais disputado da história foi o de 2009, onde a diferença do 1º colocado para o 3º foi de 2 pontos. Qual foi o time campeão?");
            System.out.println("a) Cruzeiro\nb) Flamengo\nc) São Paulo\nd) Internacional");
            System.out.print("Sua resposta: ");
            do{
            pergunta5 = sc.next().toUpperCase().charAt(0);
            switch (pergunta5){
                case 'A':
                case 'C':
                case 'D':
                    System.out.println("Resposta incorreta! O Flamengo foi o campeão daquela edição.");
                    System.out.println("Que pipocada! O que parecia um título certo, se tornou um vexame. O jogo acabou 2x0 para o Coritiba e o " + timeAtual + " não conseguiu o título.\nVocê não conseguiu nem a artilharia do campeonato.");
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                case 'B':
                    System.out.println("Reposta correta!");
                    System.out.println("PARABÉNS!! O " + timeAtual + " consguiu derrotar o Coritiba por 5x0, onde você marcou 3 gols e conseguiram conquistar o tão sonhado título do Brasileirão!");
                    System.out.println("Que temporada mágica!! Além do título você ainda se consagrou artilheiro do campeonato, com 25 gols!");
                    pontuaçao += 20;
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                default: 
                    System.out.print("Opção inválida, digite novamente: ");
                    break;
            }
        }while (pergunta5 != 'A' && pergunta5 != 'B' && pergunta5 != 'C' && pergunta5 != 'D');
    }
    else if(pergunta3 == 'A' || pergunta3 == 'B' || pergunta3 == 'C'){
            System.out.println("\n\nHoje é a última rodada do Brasileirão e o " + timeAtual +  " acabou ficando um pouco para trás na disputa, vença a partida e garanta pelo menos uma vaga para a próxima Libertadores.");
            System.out.println("Além disso, você está disputando a artilharia do campeonato com o Gabigol, do Flamengo. Você vai precisar de dois gols para ultrapassá-lo.");
            System.out.print("----------------------------------------------------------------------------------------------------------");
            System.out.println("\nUm dos Brasileirões mais disputado da história foi o de 2009, onde a diferença do 1º colocado para o 3º foi de 2 pontos. Qual foi o time campeão?");
            System.out.println("a) Cruzeiro\nb) Flamengo\nc) São Paulo\nd) Interncaional");
            System.out.print("Sua resposta: ");
            do{
            pergunta5 = sc.next().toUpperCase().charAt(0);
            switch (pergunta5){
                case 'A':
                case 'C':
                case 'D':
                    System.out.println("Resposta incorreta! O Flamengo foi o campeão daquela edição.");
                    System.out.println("Que pipocada! Oque parecia uma classificação certa, se tornou um vexame. O jogo acabou 2x0 para o Coritiba e o " + timeAtual + " não conseguiu a vaga.\nVocê não conseguiu nem a artilharia do campeonato.");
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                case 'B':
                    System.out.println("Reposta correta!");
                    System.out.println("PARABÉNS!! O " + timeAtual + " conseguiu derrotar o Coritiba por 5x0, onde você marcou 3 gols e conseguiram a vaga para a próxima Libertadores!");
                    System.out.println("Que temporada mágica!! ");
                    pontuaçao += 20;
                    System.out.println("Sua pontução: " + pontuaçao);
                    break;
                default: 
                    System.out.print("Opção inválida, digite novamente: ");
                    break;
            }
        }while (pergunta5 != 'A' && pergunta5 != 'B' && pergunta5 != 'C' && pergunta5 != 'D');
    }

    Thread.sleep(3000);
    char pergunta6;
    if(pergunta4 =='B'){
        System.out.println("Você chegou na tão sonhada final de Libertadores e jogará contra o River Plate!\nEste com certeza é o jogo da sua vida até então!");
        System.out.println("Os torcedores estão num grande expectativa sobre o seu desempenho! Não os decepcione!");
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQual o maior artilheiro da história da Libertadores?\na) Gabigol (BRA)\nb) Alberto Spencer (EQU)\nc) Fernando Morena (URU)\nd) Daniel Onega (ARG)");
        System.out.print("Sua resposta: ");
        do{
            pergunta6 = sc.next().toUpperCase().charAt(0);
            switch (pergunta6){
                case 'B':
                    System.out.println("Resposta correta! Alberto Spencer tem 54 gols.");
                    System.out.println("HISTÓRICO!! Você acaba de conquistar a Libertadores! Fazendo dois gols e vencendo a partida contra o River por 2x1!");
                    System.out.println("Além disso foi escolhido como o craque da competição! Parabéns!");
                    pontuaçao += 20;
                    System.out.println("\nSua pontução: " + pontuaçao);
                    break;
                case 'A':
                case 'C':
                case 'D':
                    System.out.println("Resposta incorreta! Alberto Spencer tem 54 gols.");
                    System.out.println("Não foi dessa vez... O "  + timeAtual + " perdeu por 1x0 para o River. Porém apesar da derrota, você foi um dos destques do campeonato. Muito bem!");
                    System.out.println("\nSua pontução: " + pontuaçao);
                    break;
                default:
                    System.out.print("Opção inválida, digite novamente: ");
                    break;
            }
        }while (pergunta6 != 'A' && pergunta6 != 'B' && pergunta6 != 'C' && pergunta6 != 'D');
    }
    
    System.out.println("\n\nPontuação final: " + pontuaçao);

    if (pontuaçao >= 60){
        System.out.println("Parabéns foi destaque do ano e despertou interesse de clubes Europeus!");
        System.out.println("Desta forma você avançou para a fase 3!");
        Thread.sleep(3000);
        textFaseTres();   
        Thread.sleep(3000);         
        Fase3();
    }else{
        System.out.println("Você não atingiu a pontuação necessária para avançar para a próxima temporada e com isso, encerramos aqui a sua jornada!");
        System.exit(0);
    }
}
public static void Fase3() throws InterruptedException {
  Scanner sc = new Scanner(System.in);
  Random rd = new Random();
  char paisEuropeuPergunta;
  char clubeEuropeuPergunta;
  int paisEuropeu = 0;
  int acerto = 0;
  int erro = 0;
  int campeao = 0;
  int desempenhoCopa = 0;
  String nomeDoClube = "0";
  String nomePaís = "0";
  String maiorRival = "0";
  String nomeDoCampeonato = "0";
  String timeQualquer = "0";

  do {
    System.out.println(
        "Você concluiu o seu ciclo no futebol brasileiro! Está pronto para novos desafios no velho continente?");
    System.out.println("Selecionamos três grandes países para receberem seu futebol. Escolha um:");
    System.out.println("A - Itália");
    System.out.println("B - Inglaterra");
    System.out.println("C - Espanha");

    paisEuropeuPergunta = sc.next().toUpperCase().charAt(0);

    System.out.println("");
    switch (paisEuropeuPergunta) {
      case 'A':
        paisEuropeu = 1;
        System.out.println("Você escolheu a Itália!");
        System.out.println(
            "Na Itália você encontrará jogadores do mundo todo em gigantes e tradicionais clubes do futebol mundial, mas nem tudo são flores... Você só poderá escolher o seu time se acertar a nossa pergunta, caso contrario, o seu time será sorteado. Preste atenção e boa sorte ou como dizemos por aqui, buona fortuna!");
        break;

      case 'B':
        paisEuropeu = 2;
        System.out.println("Você escolheu a Inglaterra!");
        System.out.println(
            "Na Inglaterra você encontrará jogadores do mundo todo em gigantes e tradicionais clubes do futebol mundial, mas nem tudo são flores... Você só poderá escolher o seu time se acertar a nossa pergunta, caso contrario, o seu time será sorteado. Preste atenção e boa sorte ou como dizemos por aqui, Good Luck!");
        break;

      case 'C':
        paisEuropeu = 3;
        System.out.println("Você escolheu a Espanha!");
        System.out.println(
            "Na Espanha você encontrará jogadores do mundo todo em gigantes e tradicionais clubes do futebol mundial, mas nem tudo são flores... Você só poderá escolher o seu time se acertar a nossa pergunta, caso contrario, o seu time será sorteado. Preste atenção e boa sorte ou como dizemos por aqui, Buena suerte!");
        break;

      default:
        System.out.println("Opção inválida! Tente novamente.");
        System.out.println("");
    }
  } while (paisEuropeuPergunta != 'A' && paisEuropeuPergunta != 'B' && paisEuropeuPergunta != 'C');

  System.out.println("");

  /* Pergunta para escolha do time */
  char resposta1 = '0';
  do {
    List alternativas = new ArrayList();
    alternativas.add("Juventus");
    alternativas.add("Benfica");
    alternativas.add("Bayern de Munique");
    alternativas.add("Liverpool");
    Collections.shuffle(alternativas);

    System.out.println("Aqui vai a pergunta:");
    System.out.println(
        "O maior campeão da melhor competição do mundo nós já conhecemos, mas qual é o time com mais vices na história da Champions League?");
    System.out.println("A - " + alternativas.get(0));
    System.out.println("B - " + alternativas.get(1));
    System.out.println("C - " + alternativas.get(2));
    System.out.println("D - " + alternativas.get(3));

    resposta1 = sc.next().toUpperCase().charAt(0);
    System.out.println("");
    switch (resposta1) {
      case 'A':
        if (alternativas.get(0).equals("Juventus")) {
          System.out.println("Resposta correta!");
          acerto++;
        } else {
          System.out.println("Resposta incorreta!");
          erro++;
        }
        break;
      case 'B':
        if (alternativas.get(1).equals("Juventus")) {
          System.out.println("Resposta correta!");
          acerto++;
        } else {
          System.out.println("Resposta incorreta!");
          erro++;
        }
        break;
      case 'C':
        if (alternativas.get(2).equals("Juventus")) {
          System.out.println("Resposta correta!");
          acerto++;
        } else {
          System.out.println("Resposta incorreta!");
          erro++;
        }
        break;
      case 'D':
        if (alternativas.get(3).equals("Juventus")) {
          System.out.println("Resposta correta!");
          acerto++;
        } else {
          System.out.println("Resposta incorreta!");
          erro++;
        }
        break;

      default:
        System.out.println("Opção inválida! Tente novamente.");
        System.out.println("");
    }
  } while (resposta1 != 'A' && resposta1 != 'B' && resposta1 != 'C' && resposta1 != 'D');

  /* Escolha do clube */

  if (acerto >= 1) {
    System.out.println("Parabéns, você acertou nossa pergunta e tem o direito de escolher o clube que irá jogar.");
    System.out.println("Os clubes que temos disponiveis são:");
    if (paisEuropeu == 1) {
      nomePaís = "Itália";
      nomeDoCampeonato = "Série A";
      timeQualquer = "Bologna";

      do {
        System.out.println("A - Inter de Milão");
        System.out.println("B - Juventus");
        System.out.println("C - Milan");
        System.out.println("Por favor, escolha um dos clubes:");

        clubeEuropeuPergunta = sc.next().toUpperCase().charAt(0);
        System.out.println("");
        switch (clubeEuropeuPergunta) {
          case 'A':
            System.out.println("Você escolheu a Inter de Milão.");
            System.out.println(
                "Seja muito bem vindo ao clube! Por aqui nós dividimos o nosso estádio com nosso maior rival, o Milan. Apesar de dentro de campo sermos rivais, fora dele, prezamos pela paz e bem estar de nossos torcedores. A divisão de estádio é uma ótima alternativa financeira e enfatiza essa ideia de sermos rivais apenas de campo, que por aqui é sempre um só haha! Boa sorte no nosso clube!");
            nomeDoClube = "Inter de Milão";
            maiorRival = "Milan";
            break;

          case 'B':
            System.out.println("Você escolheu a Juventus.");
            System.out.println(
                "Seja muito bem vindo ao clube! O maior clássico da Itália, para nós, é Inter vs Juventus, também conhecido como Derby d'Italia, é o derby de futebol do norte da Itália, envolvendo nós e os nanicos de Milão, venha nos ajudar a vencer este clássico! Boa sorte no nosso clube!");
            nomeDoClube = "Juventus";
            maiorRival = "Inter de Milão";
            break;

          case 'C':
            System.out.println("Você escolheu o Milan.");
            System.out.println(
                "Seja muito bem vindo ao clube! por aqui nós dividimos o nosso estádio com nosso maior rival, a Inter de Milão. Apesar de dentro de campo sermos rivais, fora dele, prezamos pela paz e bem estar de nossos torcedores. A divisão de estádio é uma ótima alternativa financeira e enfatiza essa ideia de sermos rivais apenas de campo, que por aqui é sempre um só haha! Boa sorte no nosso clube!");
            nomeDoClube = "Milan";
            maiorRival = "Inter de Milão";
            break;

          default:
            System.out.println("Opção inválida! Tente novamente.");
            System.out.println("");
        }
      } while (clubeEuropeuPergunta != 'A' && clubeEuropeuPergunta != 'B' && clubeEuropeuPergunta != 'C');
    }

    if (paisEuropeu == 2) {
      nomePaís = "Inglaterra";
      nomeDoCampeonato = "Premier League";
      timeQualquer = "Leicester City";

      do {
        System.out.println("A - Manchester City");
        System.out.println("B - Manchester United");
        System.out.println("C - Liverpool");
        System.out.println("Por favor, escolha um dos clubes:");

        clubeEuropeuPergunta = sc.next().toUpperCase().charAt(0);
        System.out.println("");
        switch (clubeEuropeuPergunta) {
          case 'A':
            System.out.println("Você escolheu o Manchester City.");
            System.out.println(
                "Seja muito bem vindo ao clube! Será muito bom vê-lo jogar no maior de Manchester. Você já deve saber que nosso maior rival é o pequeno United. Venha ser campeão conosco! Boa sorte no nosso clube!");
            nomeDoClube = "Manchester City";
            maiorRival = "Manchester United";
            break;

          case 'B':
            System.out.println("Você escolheu o Manchester United.");
            System.out.println(
                "Seja muito bem vindo ao clube! Somos conhecidos por todos como os temíveis \"RED DEVILS\". Será muito bom vê-lo fazer gols no nosso rival, Liverpool! Boa sorte no nosso clube!");
            nomeDoClube = "Manchester United";
            maiorRival = "Liverpool";
            break;

          case 'C':
            System.out.println("Você escolheu o Liverpool.");
            System.out.println(
                "Seja muito bem vindo ao clube! Por aqui você escutará o íncrivel cântico da nossa torcida \"You will never walk alone\" toda partida. Nosso maior rival histórico é o Manchester United. Boa sorte no nosso clube!");
            nomeDoClube = "Liverpool";
            maiorRival = "Manchester United";
            break;

          default:
            System.out.println("Opção inválida! Tente novamente.");
            System.out.println("");
        }
      } while (clubeEuropeuPergunta != 'A' && clubeEuropeuPergunta != 'B' && clubeEuropeuPergunta != 'C');
    }

    if (paisEuropeu == 3) {
      nomePaís = "Espanha";
      nomeDoCampeonato = "La Liga";
      timeQualquer = "Sevilla";

      do {
        System.out.println("A - Real Madrid");
        System.out.println("B - Barcelona");
        System.out.println("C - Atlético de Madrid");
        System.out.println("Por favor, escolha um dos clubes:");

        clubeEuropeuPergunta = sc.next().toUpperCase().charAt(0);
        System.out.println("");
        switch (clubeEuropeuPergunta) {
          case 'A':
            System.out.println("Você escolheu o Real Madrid.");
            System.out.println(
                "Seja muito bem vindo ao clube! Será muito bom vê-lo jogar no maior da Espanha e do mundo, somos os maiores campeões do maior e melhor torneio do mundo a Champions League. Você já deve saber, mas o nosso maior rival se chama Barcelona. Venha ser campeão conosco! Boa sorte no nosso clube!");
            nomeDoClube = "Real Madrid";
            maiorRival = "Barcelona";
            break;

          case 'B':
            System.out.println("Você escolheu o Barcelona.");
            System.out.println(
                "Seja muito bem vindo ao clube! Será muito bom vê-lo fazer gols no nosso rival de Madrid, eles se julgam o maior time do mundo, mas é o nosso maior freguês hahaha! Boa sorte no nosso clube!");
            nomeDoClube = "Barcelona";
            maiorRival = "Real Madrid";
            break;

          case 'C':
            System.out.println("Você escolheu o Atlético de Madrid.");
            System.out.println(
                "Seja muito bem vindo ao clube! Será muito bom tê-lo no nosso clube. Nosso maior rival é o Real Madrid, com quem fazemos o dérbi de Madrid, espero que faça muitos gold neles hahaha! Boa sorte no nosso clube!");
            nomeDoClube = "Atlético de Madrid";
            maiorRival = "Real Madrid";
            break;

          default:
            System.out.println("Opção inválida! Tente novamente.");
            System.out.println("");
        }
      } while (clubeEuropeuPergunta != 'A' && clubeEuropeuPergunta != 'B' && clubeEuropeuPergunta != 'C');
    }
  }
  /* Sorteio do clube */

  if (erro >= 1) {
    int clubeSorteado = rd.nextInt(3);
    System.out.println("O clube sorteado foi:");
    if (paisEuropeu == 1) {
      nomePaís = "Itália";
      nomeDoCampeonato = "Série A";
      timeQualquer = "Bologna";
      if (clubeSorteado == 0) {
        System.out.println("INTER DE MILÃO");
        System.out.println(
            "Seja muito bem vindo ao clube! Por aqui nós dividimos o nosso estádio com nosso maior rival, o Milan. Apesar de dentro de campo sermos rivais, fora dele, prezamos pela paz e bem estar de nossos torcedores. A divisão de estádio é uma ótima alternativa financeira e enfatiza essa ideia de sermos rivais apenas de campo, que por aqui é sempre um só haha! Boa sorte no nosso clube!");
        nomeDoClube = "Inter de Milão";
        maiorRival = "Milan";
      }
      if (clubeSorteado == 1) {
        System.out.println("JUVENTUS.");
        System.out.println(
            "Seja muito bem vindo ao clube! O maior clássico da Itália, para nós, é Inter vs Juventus, também conhecido como Derby d'Italia, é o derby de futebol do norte da Itália, envolvendo nós e os nanicos de Milão, venha nos ajudar a vencer este clássico! Boa sorte no nosso clube!");
        nomeDoClube = "Juventus";
        maiorRival = "Inter de Milão";
      }
      if (clubeSorteado == 2) {
        System.out.println("MILAN.");
        System.out.println(
            "Seja muito bem vindo ao clube! por aqui nós dividimos o nosso estádio com nosso maior rival, a Inter de Milão. Apesar de dentro de campo sermos rivais, fora dele, prezamos pela paz e bem estar de nossos torcedores. A divisão de estádio é uma ótima alternativa financeira e enfatiza essa ideia de sermos rivais apenas de campo, que por aqui é sempre um só haha! Boa sorte no nosso clube!");
        nomeDoClube = "Milan";
        maiorRival = "Inter de Milão";
      }
    }
    if (paisEuropeu == 2) {
      nomePaís = "Inglaterra";
      nomeDoCampeonato = "Premier League";
      timeQualquer = "Leicester City";
      if (clubeSorteado == 0) {
        System.out.println("MANCHESTER CITY.");
        System.out.println(
            "Seja muito bem vindo ao clube! Será muito bom vê-lo jogar no maior de Manchester. Você já deve saber que nosso maior rival é o pequeno United. Venha ser campeão conosco! Boa sorte no nosso clube!");
        nomeDoClube = "Manchester City";
        maiorRival = "Manchester United";
      }
      if (clubeSorteado == 1) {
        System.out.println("MANCHESTER UNITED.");
        System.out.println(
            "Seja muito bem vindo ao clube! Somos conhecidos por todos como os temíveis \"RED DEVILS\". Será muito bom vê-lo fazer gols no nosso rival, Liverpool! Boa sorte no nosso clube!");
        nomeDoClube = "Manchester United";
        maiorRival = "Liverpool";
      }
      if (clubeSorteado == 2) {
        System.out.println("LIVERPOOL.");
        System.out.println(
            "Seja muito bem vindo ao clube! Por aqui você escutará o íncrivel cântico da nossa torcida \"You will never walk alone\" toda partida. Nosso maior rival histórico é o Manchester United. Boa sorte no nosso clube!");
        nomeDoClube = "Liverpool";
        maiorRival = "Manchester United";
      }
    }
    if (paisEuropeu == 3) {
      nomePaís = "Espanha";
      nomeDoCampeonato = "La Liga";
      timeQualquer = "Sevilla";
      if (clubeSorteado == 0) {
        System.out.println("REAL MADRID.");
        System.out.println(
            "Seja muito bem vindo ao clube! Será muito bom vê-lo jogar no maior da Espanha e do mundo, somos os maiores campeões do maior e melhor torneio do mundo a Champions League. Você já deve saber, mas o nosso maior rival se chama Barcelona. Venha ser campeão conosco! Boa sorte no nosso clube!");
        nomeDoClube = "Real Madrid";
        maiorRival = "Barcelona";
      }
      if (clubeSorteado == 1) {
        System.out.println("BARCELONA.");
        System.out.println(
            "Seja muito bem vindo ao clube! Será muito bom vê-lo fazer gols no nosso rival de Madrid, eles se julgam o maior time do mundo, mas é o nosso maior freguês hahaha! Boa sorte no nosso clube!");
        nomeDoClube = "Barcelona";
        maiorRival = "Real Madrid";
      }
      if (clubeSorteado == 2) {
        System.out.println("ATLÉTICO DE MADRID.");
        System.out.println(
            "Seja muito bem vindo ao clube! Será muito bom tê-lo no nosso clube. Nosso maior rival é o Real Madrid, com quem fazemos o dérbi de Madrid, espero que faça muitos gold neles hahaha! Boa sorte no nosso clube!");
        nomeDoClube = "Atlético de Madrid";
        maiorRival = "Real Madrid";
      }
    }
  }

  /* Temporada na Europa */
  Thread.sleep(5000);
  int desempenho = 0;
  System.out.println("\nAgora que você já está jogando em um clube europeu, o seu futebol é de alto nível e com isso, as perguntas vão acompanhar o nível do seu futebol! Se prepare!");
  System.out.println("Chegou a hora da sua estreia!\n");
  System.out.println("Acertar as perguntas de agora em diante, definirá o seu desempenho!");
  System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");
  System.out.println("Vamos a primeira pergunta:\n");
  Thread.sleep(3000);
  char perguntaEstreia;
  do {
    System.out.println("1ª) Cristiano Ronaldo é o jogador que mais fez gols em uma única edição de Champions League. Quantos gols ele fez para atingir essa marca?");
    System.out.println("A - 16 gols");
    System.out.println("B - 17 gols");
    System.out.println("C - 18 gols");

    perguntaEstreia = sc.next().toUpperCase().charAt(0);
    System.out.println("");
    switch (perguntaEstreia) {
      case 'B':
        desempenho += 20;
        System.out.println("Parabéns!");
        System.out
            .println("Você acertou a pergunta e como resultado o seu desempenho na partida de estreia foi ótimo.");
        System.out.println("Os torcedores do " + nomeDoClube
            + " estão muito empolgados com a sua estreia, afinal não é todo dia que vemos um jogador fazer DOIS gols na estreia, será esse o novo terror do "
            + maiorRival + "?");
        System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");

        break;

      case 'A':
      case 'C':
        System.out.println("Mandou mal!");
        System.out.println(
            "Você errou a pergunta e como consequência fez uma partida de estreia ruim, mas não desanime, tudo ainda pode melhorar.");
        System.out.println("Os torcedores do " + nomeDoClube
            + " estão chateados com a sua estreia. Você perdeu muitos gols e errou alguns passes, porém nada está perdido. O time é bom e você terá outras oportunidades de fazer bonito, inclusive um clássico contra rival "
            + maiorRival + ".");
        System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");
        break;

      default:
        System.out.println("Opção inválida! Tente novamente.");
        System.out.println("");
    }
  } while (perguntaEstreia != 'A' && perguntaEstreia != 'B' && perguntaEstreia != 'C');

  Thread.sleep(3000);
  System.out.println("");
  System.out.println("Você concluiu a partida de estréia, e agora irá jogar pela " + nomeDoCampeonato
      + ". O jogo será contra o " + timeQualquer + ".");
  System.out.println("Acerte a pergunta para ir bem no jogo.");
  System.out.println("");
  System.out.println("Lá vai a pergunta:");
  char pergunta2 = '0';
  do {
    System.out.println("2ª) Qual time perdeu a final da Liga dos Campeões de 2004?");
    System.out.println("A - Bayern de Munique");
    System.out.println("B - Barcelona");
    System.out.println("C - Monaco");

    pergunta2 = sc.next().toUpperCase().charAt(0);
    System.out.println("");
    switch (pergunta2) {
      case 'C':
        desempenho += 20;
        System.out.println("Parabéns!");
        System.out.println("Você acertou a pergunta e como resultado o seu desempenho na partida foi ótimo.");
        System.out.println("Os torcedores do " + nomeDoClube
            + " estão contentes com a sua atuação, mantenha o nível, o próximo jogo é um clássico contra o "
            + maiorRival + ".");
        System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");
        break;

      case 'A':
      case 'B':
        System.out.println("Mandou mal!");
        System.out.println(
            "Você errou a pergunta e como consequência fez uma partida ruim, mas não desanime, tudo ainda pode melhorar.");
        System.out.println(
            "Se concentre, uma boa atuação contra o " + maiorRival + " fará você cair nas graças da torcida.");
        System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");

        break;

      default:
        System.out.println("Opção inválida! Tente novamente.");
        System.out.println("");
    }
  } while (pergunta2 != 'A' && pergunta2 != 'B' && pergunta2 != 'C');

  Thread.sleep(3000);
  System.out.println("");
  System.out.println("Chegou o grande momento!");
  System.out.println("Nada como um grande clássico para ganhar confiança ou se manter em alta, não é mesmo!?");
  System.out.println("Acerte a pergunta para ir bem no clássico.");
  System.out.println("");
  System.out.println("Lá vai a pergunta:");
  char pergunta3 = '0';
  do {
    System.out.println("3ª) O Real Madrid venceu a primeira edição da Champions League realizada em 1956 e foi campeão por alguns anos seguidos. Em qual ano a taça da Champions League foi conquistada pela primeira vez por um clube diferente do gigante de Madrid?");
    System.out.println("A - 1961, foi conquistada pelo Benfica");
    System.out.println("B - 1962, foi conquistada pelo Milan");
    System.out.println("C - 1962, foi conquistada pela Inter de Milão");

    pergunta3 = sc.next().toUpperCase().charAt(0);
    System.out.println("");
    switch (pergunta3) {
      case 'A':
        desempenho += 20;
        System.out.println("Parabéns!");
        System.out.println("Você acertou a pergunta e como resultado o seu desempenho no clássico foi ótimo.");
        System.out.println("Os torcedores do " + nomeDoClube
            + " estão eufóricos com a sua atuação, nada melhor do que uma vitória contra o " + maiorRival
            + " para animar as coisas, perto de uma decisão de mata-mata de Champions League.");
        System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");

        break;

      case 'C':
      case 'B':
        System.out.println("Mandou mal!");
        if (desempenho >= 20) {
          System.out.println("Você errou a pergunta e como consequência fez uma partida ruim!");
          System.out.println(
              "Os torcedores estão chateados com a sua atuação. A próxima partida será um grande jogo na fase de mata-mata da Champions League, se decepcionar novamente, pode ser o fim da linha para você.");
          System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");
          break;
        } else {
          System.out.println(
              "Infelizmente, o seu desempenho na Europa não foi nada perto do esperado, com um acúmulo de várias partidas ruins, iremos rescindir o seu contrato, boa sorte em seu novo desafio!");
          System.out.println("O seu desempenho foi de " + desempenho + " pontos.");

          Fase4();

          System.out.println("Você concluiu o jogo!");
          System.out.println(
              "Infelizmente você não conseguiu atingir o máximo que o jogo tem para oferecer, tente jogar novamente para conseguir um melhor final de carreira para o seu jogador!");
          System.out.println("Obrigado por jogar Soccer Carrer Java! :)");
          break;
        }

      default:
        System.out.println("Opção inválida! Tente novamente.");
        System.out.println("");
    }
  } while (pergunta3 != 'A' && pergunta3 != 'B' && pergunta3 != 'C');

  int semifinalChampions = 0;

  if (desempenho >= 20) {
    Thread.sleep(3000);
    System.out.println("");
    System.out.println("Está na hora de verificarmos se o seu esforço deu resultado!");
    System.out.println(
        "Agora é tudo ou nada, passamos por uma competição com altos e baixos, mas aqui estamos, não podemos errar mais nada agora.");
    System.out.println("");
    System.out.println(
        "Você está na sonhada semifinal da Liga dos Campeões, só os quatro melhores clubes chegam até aqui! Vamos em busca da grande final!");
    System.out.println("Acerte a pergunta para ir bem nos jogos das semifinais da Champions League.");
    System.out.println("");
    System.out.println("Lá vai a pergunta:");

    char pergunta4 = '0';

    do {
      System.out.println("4ª) A Juventus conhecida como \"Rainha do Vice\" é a equipe que mais tem vices na história da Champions League, quantos vices tem a equipe?");
      System.out.println("A - 6 Vices");
      System.out.println("B - 7 Vices");
      System.out.println("B - 8 Vices");
      System.out.println("C - 9 Vices");

      pergunta4 = sc.next().toUpperCase().charAt(0);
      System.out.println("");
      switch (pergunta4) {
        case 'B':
          desempenho += 20;
          semifinalChampions = 1;
          System.out.println("Parabéns!");
          System.out.println("Você acertou a pergunta e como resultado o seu desempenho nas semifinais foi ótimo.");
          System.out.println(
              "Você fez dois gols no jogo de ida e na volta fez um golaço garantindo a nossa classificação a grande final da Champions League");
          System.out.println("Os torcedores do " + nomeDoClube
              + " estão eufóricos com a sua atuação, e estão muito confiantes no titulo graças a você!");
          System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");
          break;

        case 'C':
        case 'A':
        case 'D':
          System.out.println("Mandou mal!");
          if (desempenho >= 60) {
            System.out.println("Você errou a pergunta e como consequência fomos eliminados da Champions League!");
            System.out.println("Estavamos tão próximos do título, mas tudo bem, ainda podemos brigar pelo título da "
                + nomeDoCampeonato + ".");
            System.out.println(
                "Os torcedores estão chateados com a eliminação. A torcida queria muito o título, mas infelizmente ele não veio, no próximo jogo, você poderá reconquistar a torcida se vencer o "
                    + maiorRival + ".");
            System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");
            break;
          } else {
            System.out.println(
                "Infelizmente, o seu desempenho na Europa não foi o esperado. Aqui a cobrança é muito grande e esse não foi o seu único jogo ruim, infelizmente teremos que rescindir o seu contrato. Boa sorte em seus novos desafios!");
            System.out.println("O seu desempenho foi de " + desempenho + " pontos.");

            Fase4();

            System.out.println("Você concluiu o jogo!");
            System.out.println(
                "Infelizmente você não conseguiu atingir o máximo que o jogo tem para oferecer, tente jogar novamente para conseguir um melhor final de carreira para o seu jogador!");
            System.out.println("Obrigado por jogar Soccer Carrer Java! :)");
            break;
          }

        default:
          System.out.println("Opção inválida! Tente novamente.");
          System.out.println("");
      }
    } while (pergunta4 != 'A' && pergunta4 != 'B' && pergunta4 != 'C' && pergunta4 != 'D');
  }

  if (semifinalChampions == 1) {
    Thread.sleep(3000);
    System.out.println("");
    System.out.println("Você chegou na grande final da Champions League!");
    System.out.println("Um momento muito aguardado por todos os torcedores do " + nomeDoClube + ".");
    System.out.println("");
    System.out.println("Você é o craque do time e o seu desempenho servirá de exemplo para a atuação do "
        + nomeDoClube + " em campo. Então...");
    Thread.sleep(3000);
    System.out.println("Acerte a pergunta para se tornar o grande campeão da Champions League.");
    System.out.println("");
    System.out.println("Lá vai a pergunta:");

    char pergunta5 = '0';

    do {
      System.out.println("5ª) Na edição de 2021/2022 tivemos o Real Madrid sendo campeão para cima do Liverpool na final por 1x0, quem marcou o gol da equipe merengue e em que minuto o gol saiu?");
      System.out.println("A - Vini Jr aos 42 minutos.");
      System.out.println("B - Benzema aos 42 minutos.");
      System.out.println("C - Vini Jr aos 59 minutos.");
      System.out.println("D - Luka Modric aos 43 minutos.");
      System.out.println("E - Vini Jr aos 62 minutos.");

      pergunta5 = sc.next().toUpperCase().charAt(0);

      System.out.println("");

      switch (pergunta5) {
        case 'C':
          desempenho += 20;
          semifinalChampions = 1;
          campeao = 1;
          System.out.println("Parabéns CAMPEÃO!");
          System.out.println(
              "Você acertou a pergunta e terminou essa temporada da melhor maneira possível, sendo o grande CAMPEÃO da CHAMPIONS LEAGUE!!!!!");
          System.out.println("Você fez dois gols na final e se consagrou como possível próximo ídolo do clube.");
          System.out.println("");
          System.out.println("Os torcedores do " + nomeDoClube
              + " estão eufóricos com a sua atuação, e estão muito contentes com o titulo!");
          System.out.println("Mas não pense que acabou!! O campeão merece uma chance na copa do mundo, não?!");
          System.out.println("O seu desempenho foi de " + desempenho + " pontos.");
          break;

        case 'A':
        case 'B':
        case 'D':
        case 'E':
          System.out.println("Mandou mal!");
          if (desempenho >= 80 || semifinalChampions == 1) {
            System.out.println("Você errou a pergunta e como consequência perdemos a grande final!");
            System.out.println("Estavamos tão próximos do título, mas tudo bem, ainda podemos brigar pelo título da "+ nomeDoCampeonato + ".");
            System.out.println("Os torcedores estão chateados com a eliminação. A torcida queria muito o título, mas infelizmente ele não veio, no próximo jogo, você poderá reconquistar a torcida se vencer o " + maiorRival + ".");
            System.out.println("O seu desempenho atual é de " + desempenho + " pontos.");
            break;

          } else {
            System.out.println(
                "Você errou quando estava na cara do gol, era a sua grande chance de disputar a copa do mundo, e esse não foi o único jogo ruim e perder a grande final é um grande baque.");
            System.out.println("Sinto muito pela derrota na grande final, mas ...");
            Thread.sleep(3000);
            System.out.println("");
            System.out.println(
                "Infelizmente, o seu desempenho na Europa não foi o esperado. Aqui a cobrança é muito grande e esse não foi o seu único jogo ruim, infelizmente teremos que rescindir o seu contrato. Boa sorte em seus novos desafios!");
            System.out.println("O seu desempenho foi de " + desempenho + " pontos.");

            Fase4();

            System.out.println("Você concluiu o jogo!");
            System.out.println(
                "Infelizmente você não conseguiu atingir o máximo que o jogo tem para oferecer, tente jogar novamente para conseguir um melhor final de carreira para o seu jogador!");
            System.out.println("Obrigado por jogar Soccer Carrer Java! :)");
            break;
          }

        default:
          System.out.println("Opção inválida! Tente novamente.");
          System.out.println("");
      }
    } while (pergunta5 != 'A' && pergunta5 != 'B' && pergunta5 != 'C' && pergunta5 != 'D' && pergunta5 != 'E');
  }

  if (campeao == 0 && desempenho >= 60) {
    Thread.sleep(3000);
    System.out.println("");
    System.out.println(
        "Você está liderando a " + nomeDoCampeonato + " e seu clube está disputando ponto a ponto com o "
            + maiorRival + " por coincidência do destino a última rodada será contra eles.");
    System.out.println(
        "Você precisa vencer esse jogo para ser campeão nessa temporada e ter alguma chance na seleção.");
    System.out.println("");
    System.out.println("Você é o craque do time e o seu desempenho servirá de exemplo para a atuação do "
        + nomeDoClube + " em campo. Então...");
    Thread.sleep(3000);
    System.out.println("Acerte a pergunta para ir bem no clássico.");
    System.out.println("");
    System.out.println("Lá vai a pergunta:");

    char perguntaExtra = '0';

    do {
      System.out.println("Quem foi o ÚNICO goleiro que ganhou a Bola de Ouro?");
      System.out.println("A - Iker Casillas");
      System.out.println("B - Thibaut Courtois");
      System.out.println("C - Gianluigi Buffon");
      System.out.println("D - Lev Yashin.");
      System.out.println("E - Gordon Banks.");

      perguntaExtra = sc.next().toUpperCase().charAt(0);

      System.out.println("");

      switch (perguntaExtra) {
        case 'D':
          desempenho += 20;
          campeao = 1;
          System.out.println("Parabéns CAMPEÃO!");
          System.out.println("Você acertou a pergunta e venceu o clássico contra o " + maiorRival + " levando o título da " + nomeDoCampeonato + " para casa!!");
          System.out.println("");
          System.out.println("Os torcedores do " + nomeDoClube+ " estão eufóricos com a sua atuação, e estão muito contentes com o título!");
          System.out.println("Mas não pense que acabou!! O campeão merece uma chance na copa do mundo, não?!");
          System.out.println("O seu desempenho foi de " + desempenho + " pontos.");
          break;

        case 'A':
        case 'B':
        case 'C':
        case 'E':
          System.out.println("Mandou mal!");
          System.out.println(
              "Você errou quando estava na cara do gol, era a sua grande chance de disputar a copa do mundo, e esse não foi o único jogo ruim, perder o clássico e o título dessa maneira é um grande baque.");
          System.out.println("Sinto muito pela derrota no clássico, mas ...");
          Thread.sleep(3000);
          System.out.println("");
          System.out.println(
              "Infelizmente, o seu desempenho na Europa não foi o esperado. Aqui a cobrança é muito grande e esse não foi o seu único jogo ruim, infelizmente teremos que rescindir o seu contrato. Boa sorte em seus novos desafios!");
          System.out.println("O seu desempenho foi de " + desempenho + " pontos.");

          Fase4();

          System.out.println("Você concluiu o jogo!");
          System.out.println(
              "Infelizmente você não conseguiu atingir o máximo que o jogo tem para oferecer, tente jogar novamente para conseguir um melhor final de carreira para o seu jogador!");
          System.out.println("Obrigado por jogar Soccer Carrer Java! :)");
          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
          System.out.println("");
      }
    } while (perguntaExtra != 'A' && perguntaExtra != 'B' && perguntaExtra != 'C' && perguntaExtra != 'D'
        && perguntaExtra != 'E');
  }

  textCopaDoMundo();

  if (campeao == 1) {
    Thread.sleep(3000);
    char perguntaCopa = '0';

    System.out.println("");
    System.out.println(
        "É muito bom vê-lo na seleção brasileira, campeão! Espero que possa nos ajudar a vencer mais este desafio!\nO jogo será contra a seleção francesa, pela fase de grupos da copa do mundo.");
    System.out.println("Você terá um novo medidor de desempenho durante a copa do mundo.\nO seu desempenho atual é de " + desempenhoCopa + " pontos.\nAcerte a pergunta para ir bem no jogo.");
    System.out.println("");
    System.out.println("Lá vai a pergunta:");

    do {
      System.out.println("Qual confederação ganhou mais Copas do Mundo combinadas?");
      System.out.println("A - CONMEBOL");
      System.out.println("B - UEFA");
      System.out.println("C - CAF");

      perguntaCopa = sc.next().toUpperCase().charAt(0);
      System.out.println("");
      switch (perguntaCopa) {
        case 'B':
          desempenhoCopa += 20;
          System.out.println("Parabéns!");
          System.out.println("Você acertou a pergunta e como resultado o seu desempenho na partida foi ótimo.");
          System.out.println("Os brasileiros estão contentes com a sua atuação, mantenha o nível!!");
          System.out.println("O seu desempenho atual na copa é de " + desempenhoCopa + " pontos.");
          break;

        case 'A':
        case 'C':
          System.out.println("Mandou mal!");
          System.out.println(
              "Você errou a pergunta e como consequência fez uma partida ruim, mas não desanime, tudo ainda pode melhorar.");
          System.out.println(
              "Ainda temos condições de passar para a fase de mata-mata, mas de agora em diante, não podemos errar mais nada, entendido?");
          System.out.println("O seu desempenho atual na copa é de " + desempenhoCopa + " pontos.");

          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
          System.out.println("");
      }
    } while (perguntaCopa != 'A' && perguntaCopa != 'B' && perguntaCopa != 'C');

    Thread.sleep(3000);
    System.out.println("");
    System.out.println(
        "Passamos da fase de grupos, de agora em diante é tudo ou nada!\nErrar qualquer pergunta resultará na eliminação da seleção brasileira!");
    System.out.println("Esse jogo será contra a seleção da Holanda pela oitavas de final.");
    System.out.println("Você precisa vencer esse jogo para avançar para as quartas de final, boa sorte!");
    Thread.sleep(3000);
    System.out.println("Acerte a pergunta para ir bem no jogo.");
    System.out.println("");
    System.out.println("Lá vai a pergunta:");

    char perguntaCopa2 = '0';

    do {
      System.out.println(
          "Só a Alemanha (entre 1982 e 1990) e o Brasil (entre 1994 e 2002), conseguiram fazer o quê na Copa do Mundo?");
      System.out.println("A - Ter três vencedores da Chuteira de Ouro seguidas");
      System.out.println("B - Ser comandado pelo mesmo treinador três vezes seguidas");
      System.out.println("C - Venceu seu grupo com o máximo de pontos três vezes seguidas");
      System.out.println("D - Chegou a três finais seguidas");

      perguntaCopa2 = sc.next().toUpperCase().charAt(0);

      System.out.println("");

      switch (perguntaCopa2) {
        case 'D':
          desempenhoCopa += 20;
          System.out.println("Parabéns!");
          System.out.println(
              "Você acertou a pergunta e venceu o jogo pela oitavas de final, teve um ótimo desempenho e agora o desafio será pela quartas de final, quem será o próximo adversário?");
          System.out.println("");
          System.out.println("O seu desempenho atual na copa é de " + desempenhoCopa + " pontos.");
          break;

        case 'A':
        case 'B':
        case 'C':
          campeao = 10;
          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
          System.out.println("");
      }
    } while (perguntaCopa2 != 'A' && perguntaCopa2 != 'B' && perguntaCopa2 != 'C' && perguntaCopa2 != 'D');

    if (campeao != 0 && campeao != 10) {
      Thread.sleep(3000);
      System.out.println("");
      System.out.println(
          "Passamos da oitavas de final, ufa!\nVamos em busca do título!");
      System.out.println("Esse jogo será contra a seleção da Inglaterra pela quartas de final.");
      System.out.println("Você precisa vencer esse jogo para avançar para a semifinal da competição, boa sorte!");
      Thread.sleep(3000);
      System.out.println("Acerte a pergunta para ir bem no jogo.");
      System.out.println("");
      System.out.println("Lá vai a pergunta:");

      char perguntaCopa3 = '0';

      do {
        System.out.println(
            "O que aconteceu de incomum na vitória da Holanda nos pênaltis em 2014 sobre a Costa Rica?");
        System.out.println("A - O pênalti da vitória teve que ser repetido duas vezes");
        System.out.println("B - Todos os pênaltis da Costa Rica acertaram a trave");
        System.out.println("C - Louis van Gaal colocou um goleiro reserva para a disputa de pênaltis");
        System.out.println("D - Apenas um pênalti foi marcado");

        perguntaCopa3 = sc.next().toUpperCase().charAt(0);

        System.out.println("");

        switch (perguntaCopa3) {
          case 'C':
            desempenhoCopa += 20;
            System.out.println("Parabéns!");
            System.out.println(
                "Você acertou a pergunta e venceu o jogo pela quartas de final!\nAgora as coisas ficam mais dificeis, mais dois jogos e o título é nosso!");
            System.out.println("");
            System.out.println("O seu desempenho atual na copa é de " + desempenhoCopa + " pontos.");
            break;

          case 'A':
          case 'B':
          case 'D':
            campeao = 10;
            break;

          default:
            System.out.println("Opção inválida! Tente novamente.");
            System.out.println("");
        }
      } while (perguntaCopa3 != 'A' && perguntaCopa3 != 'B' && perguntaCopa3 != 'C' && perguntaCopa3 != 'D');
    }

      if (campeao != 0 && campeao != 10) {
      Thread.sleep(3000);
      System.out.println("");
      System.out.println(
          "Passamos da quartas de final, ufa!\nEssa realmente foi difícil!");
      System.out.println("Esse jogo será contra a seleção da Argentina pela semifinal.");
      System.out.println("Você precisa vencer esse jogo para avançar para a grande final da competição, boa sorte!");
      Thread.sleep(3000);
      System.out.println("Acerte a pergunta para ir bem no jogo.");
      System.out.println("");
      System.out.println("Lá vai a pergunta:");

      char perguntaCopa4 = '0';

      do {
        System.out.println(
            "Qual desses países NÃO sediou a Copa do Mundo mais de uma vez?");
        System.out.println("A - México");
        System.out.println("B - Espanha");
        System.out.println("C - Itália");
        System.out.println("D - França");
        System.out.println("E - Alemanha");

        perguntaCopa4 = sc.next().toUpperCase().charAt(0);

        System.out.println("");

        switch (perguntaCopa4) {
          case 'B':
            desempenhoCopa += 20;
            System.out.println("Parabéns!");
            System.out.println(
                "Agora estamos muito próximos do título!\nOs brasileiros querem muito essa conquista, rumo ao HEXA!");
            System.out.println("");
            System.out.println("O seu desempenho atual na copa é de " + desempenhoCopa + " pontos.");
            break;

          case 'A':
          case 'C':
          case 'D':
          case 'E':
            campeao = 10;
            break;

          default:
            System.out.println("Opção inválida! Tente novamente.");
            System.out.println("");
        }
      } while (perguntaCopa4 != 'A' && perguntaCopa4 != 'B' && perguntaCopa4 != 'C' && perguntaCopa4 != 'D'
          && perguntaCopa4 != 'E');
    }

      if (campeao != 0 && campeao != 10) {
      Thread.sleep(3000);
      System.out.println("");
      System.out.println("PARABÉNS!");
      System.out.println(
          "Você chegou na grandiosa final da COPA DO MUNDO! Foram muitos jogos que exigiram muito de você para chegar até aqui.");
      System.out.println("A grande final será contra a ALEMANHA!");
      System.out.println("Não se esqueça de tudo que passou, pense bem, antes de responder e boa sorte!");
      Thread.sleep(3000);
      System.out.println("Acerte a pergunta para ir bem no jogo.");
      System.out.println("");
      System.out.println("Lá vai a última pergunta:");

      char perguntaCopa5 = '0';

        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("5ª) Qual desses presidentes da FIFA deu nome ao troféu da Copa do Mundo?");
        System.out.println("a) Rodolphe Seeldrayers");
        System.out.println("b) Robert Guerin");
        System.out.println("c) Ernst Thommen");
        System.out.println("d) Gianni Infantino");
        System.out.println("e) Júlio Rimet");

        do {
        perguntaCopa5 = sc.next().toUpperCase().charAt(0);

        System.out.println("");

        switch (perguntaCopa5) {
          case 'E':
            desempenhoCopa += 20;
            System.out.println("                                                 ||");
            System.out.println("|||||||     ||     |||||||     ||     ||||||| |||||| ||   || ||||||");
            System.out.println("||   ||    ||||    ||   ||    ||||    ||   || ||     |||  || ||    ");
            System.out.println("|||||||   ||  ||   |||||||   ||  ||   ||||||| |||||| || |||| ||||||");
            System.out.println("||       ||||||||  || |||   ||||||||  ||   || ||     ||  |||     ||");
            System.out.println("||      ||      || ||  ||| ||      || ||||||| |||||| ||   || ||||||");
            System.out.println(
                "O BRASIL É HEXA CAMPEÃO DO MUNDO!\nVocê fez de tudo nessa final e concluiu o jogo sendo o grande CAMPEÃO DO MUNDO!");
            System.out.println(
                "Devolvemos o vexame de 2014! Que partida, craque! Você fez 4 gols e devolvemos o tão falado 7x1!");
            System.out.println("Estão te chamando por ai de o novo Pelé, que honra, hein?!");
            System.out.println("");
            System.out.println("O seu desempenho na copa foi de " + desempenhoCopa + " pontos.");
            System.out.println("");
            System.out.println("Obrigado por jogar Football Career Java! Volte sempre que quiser! :)");
            break;

          case 'A':
          case 'C':
          case 'D':
          case 'B':
            System.out.println(
                "Você chegou muito perto de ser campeão. Perder a final é muito doído.\nInfelizmente você estava muito apagado na final e concluiu sua história sem vencer a copa do mundo, sinto muito! :()");
            System.out.println("Você concluiu o jogo!");
            System.out.println(
                "Infelizmente você não conseguiu atingir o máximo que o jogo tem para oferecer, tente jogar novamente para conseguir um melhor final de carreira para o seu jogador!");
            System.out.println("Obrigado por jogar Football Career Java! :)");
            break;

          default:
            System.out.println("Opção inválida! Tente novamente.");
            System.out.println("");
        }
      } while (perguntaCopa5 != 'A' && perguntaCopa5 != 'B' && perguntaCopa5 != 'C' && perguntaCopa5 != 'D'
          && perguntaCopa5 != 'E');
    }

    if (campeao == 10) {
      System.out.println("Mandou mal!");
      System.out.println(
          "Você não jogou bem e fomos eliminados da copa do mundo.\nInfelizmente sua jornada termina por aqui. Mais sorte na próxima!");
      System.out.println("O seu desempenho na copa foi de " + desempenhoCopa + " pontos.");
      System.out.println("");
      System.out.println("Você concluiu o jogo!");
      System.out.println(
          "Infelizmente você não conseguiu atingir o máximo que o jogo tem para oferecer, tente jogar novamente para conseguir um melhor final de carreira para o seu jogador!");
      System.out.println("Obrigado por jogar Football Career Java! :)");
    }
  }
}
    public static void Fase4() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String seuTime = "0";
        System.out.println("\nApós você rescindir o contrato com seu antigo clube, você se vê sem opções na Europa e decide voltar para o Brasil");
        System.out.println("\nClubes das regiões Sudeste e Nordeste estão querendo te contratar.");
        System.out.println("Você tem o direito de escolher a região");    
        System.out.println("1) Sudeste\n2) Nordeste");
        System.out.print("Escolha uma região: ");
        String regiao = sc.nextLine();
    
        if (regiao.equals("1")) {
            System.out.println("Você escolheu a região: Sudeste.");
        } else if (regiao.equals("2")) {
            System.out.println("Você escolheu a região: Nordeste.");
        } else {
            while (true) {
                if (regiao.equals("1") || regiao.equals("2")) {
                    if (regiao.equals("1")) {
                        System.out.println("Você escolheu a região: Sudeste.");
                        break;
                    } else if (regiao.equals("2")) {
                        System.out.println("Você escolheu a região: Nordeste.");
                        break;
                    }
                } else {
                    System.out.print("Opção inválida. Digite novamente: ");
                    regiao = sc.nextLine();
                }
            }
        }
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQual clube é o maior vencedor da Copa Libertadores?\na) Boca Juniors\nb) São Paulo\nc) Palmeiras\nd) Independiente");
        System.out.print("Sua resposta: ");
        String resposta = sc.nextLine().toUpperCase();
        while (true) {
            if (resposta.equals("a".toUpperCase()) || resposta.equals("b".toUpperCase()) || resposta.equals("c".toUpperCase()) || resposta.equals("d".toUpperCase())) {
                break;
            } else {
                System.out.print("Opção inválida. Digite novamente: ");
                resposta = sc.nextLine().toUpperCase();
            }
        }
    
        String clubesSudeste [] = new String [] {
                "América-mg", "Botafogo"
        };
    
        String clubesNordeste [] = new String [] {
                "Fortalza", "Sport"
        };
        String escolha1;
        switch (resposta) {
            case "D":
                System.out.println("Resposta correta. O Independiente é o maior vencedor com 7 títulos.\n\nOpções disponíveis:");
                if (regiao.equals("1")) {
                    int indiceClube = 1;
                    for (String clube : clubesSudeste) {
                        System.out.println(indiceClube + ") " + clube);
                        indiceClube += 1;
                    }
                    System.out.print("\nEscolha seu novo clube: ");
                    escolha1 = sc.nextLine();
                    while (true) {
                        if (escolha1.equals("1") || escolha1.equals("2")) {
                            if (escolha1.equals("1")){
                            seuTime = clubesSudeste[Integer.parseInt(escolha1) - 1];
                            }
                            else if (escolha1.equals("2")){
                            seuTime = clubesSudeste[Integer.parseInt(escolha1) - 1];
                            }
                            break;
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            escolha1 = sc.nextLine();
                        }
                    } 
    
                    System.out.println("Parabéns! Você se tornou o novo jogador do " + seuTime + ".");
                } 
                else if (regiao.equals("2")) {
                    int indiceClube = 1;
                    for (String clube : clubesNordeste) {
                        System.out.println(indiceClube + ") " + clube);
                        indiceClube += 1;
                    }
                    System.out.print("\nEscolha seu novo clube: ");
                    escolha1 = sc.nextLine();
                    while (true) {
                        if (escolha1.equals("1") || escolha1.equals("2")) {
                            if (escolha1.equals("1")){
                                seuTime = clubesNordeste[Integer.parseInt(escolha1) - 1];
                            }
                            else if (escolha1.equals("2")){
                                seuTime = clubesNordeste[Integer.parseInt(escolha1) - 1];
                            }
                            break;
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            escolha1 = sc.nextLine();
                        }
                    }
                    System.out.printf("Parabéns! Você se tornou o novo jogador do %s.", seuTime);
                }
            break;
            case "A":
            case "B":
            case "C":
                System.out.println("Resposta incorreta. O Independiente é o maior vencedor com 7 títulos.");
                String clubeSorteado;
                if (regiao.equals("1")) {
                    clubeSorteado = clubesSudeste[rd.nextInt(clubesSudeste.length)];
                    System.out.println("\nUm momento seu novo clube está sendo sorteado. \nSeu clube sorteado é: " + clubeSorteado);
                    seuTime = clubeSorteado;
                } else if (regiao.equals("2")) {
                    clubeSorteado = clubesNordeste[rd.nextInt(clubesNordeste.length)];
                    System.out.println("\nUm momento seu novo clube está sendo sorteado. \nSeu clube sorteado é: " + clubeSorteado);
                    seuTime = clubeSorteado;
                }
             break;
        }
        int pontos = 60;
        String perguntaN1;
        System.out.println("\nAgora que já sabemos por qual clube você irá jogar! Vamos dar início a sua temporada no Brasil.");
        System.out.println("\nVocê esta estreiando pelo " + seuTime + " e irá enfrentar o Cuiabá pela 10ª rodada do brasileirão.");
        System.out.println("Acerte a pergunta abaixo para saber como que foi a sua estreia.");
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQual o maior campeão da Europa League?\na) Sevilla\nb) Manchester United\nc) PSV\nd) Villarreal ");
        System.out.print("Sua reposta: ");
        do{
            perguntaN1 = sc.nextLine().toUpperCase();
        
            switch (perguntaN1) {
                case "B":
                case "C":
                case "D":
                    System.out.println("Resposta incorreta! O Sevilla é o maior campeão com 6 títulos.");
                    System.out.println("Errou a pergunta e por isso não fez uma boa estreia, não fique triste o técnico te dará outras oportunidades.");
                    pontos -= 5;
                    System.out.println("Sua pontuação: " + pontos + "\n");
                    break;
                case "A":
                    System.out.println("Resposta correta!, O Sevilla é o maior campeão com 6 títulos.");
                    System.out.println("Parabéns pela estreia!! Você fez uma partida perfeita, marcando dois gol e dando uma linda assistência! Seu técnico está orgulhoso!");
                    pontos += 20;
                    System.out.println("Sua pontuação: " + pontos + "\n");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }while(perguntaN1 != "A" && perguntaN1 != "B" && perguntaN1 != "C" && perguntaN1 != "D");
       
        String perguntaN2;
        System.out.println("\nO " + seuTime + " está disputando o Brasileirão e a Copa Sul-Americana.");
        System.out.println("O " + seuTime + " está nas quartas de final, porém você não era relacionado por conta da falta de regularização de seu contrato. Mas agora com tudo resolvido você fará a sua estreia na copa.");
        System.out.println("Acerte a pergunta abaixo para saber como que foi a sua estreia na Sul-Americana.");
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQual o clube brasileiro que mais ganhou a Copa Sul-Americana?\na) Internacional\nb) Chapecoense\nc) São Paulo\nd) Athletico-PR");
        do{
            perguntaN2 = sc.nextLine().toUpperCase();
            switch (perguntaN2) {
                case "A":
                case "B":
                case "C":
                    System.out.println("Resposta incorreta. O Athletico-PR é o maior vencedor com 2 títulos.");
                    System.out.println("Mesmo com uma estreia ruim, não fique triste, pois ainda pode recuperar os pontos perdidos.");
                    pontos -= 10;
                    System.out.println("Sua pontuação: " + pontos + "\n");
                    break;
                case "D":
                    System.out.println("Resposta correta. O Athletico-PR é o maior vencedor com 2 títulos.");
                    System.out.println("Ótima estreia! Você classificou o " + seuTime + " fazendo dois golaços de bicicleta.");
                    pontos += 20;
                    System.out.println("Sua pontuação: " + pontos + "\n");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }while(perguntaN2 != "A" && perguntaN2 != "B" && perguntaN2 != "C" && perguntaN2 != "D");
            
        String perguntaN3;
        System.out.println("\n\nApós algumas rodadas do brasileirão, o " + seuTime + " vai jogar contra o Cruzeiro lá em Belo Horizonte, pela 35ª rodada, valendo uma classificação para a Copa Libertadores do próximo ano!");
        System.out.println("Acerte a pergunta abaixo para saber se vai classificar ou não o " + seuTime + " para a Libertadores.");
        System.out.print("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nQual jogador que mais recebeu cartões amarelos na história do campeonato brasileiro?\na) Felipe Melo\nb) Índio\nc) Lugano\nd) Fábio Luciano");
        do{
            perguntaN3 = sc.nextLine().toUpperCase();
            switch (perguntaN3) {
                case "A":
                case "C":
                case "D":
                    System.out.println("Resposta incorreta. O ex-jogador Índio tomou 98 cartões amarelos.");
                    System.out.println("Com essa derrota o " + seuTime + " precisará ganhar todos os jogos para se classificar para a Libertabores.");
                    pontos -= 15;
                    System.out.println("Sua pontuação: " + pontos + "\n");
                    break;
                case "B":
                    System.out.println("Resposta correta. O ex-jogador Índio tomou 98 cartões amarelos.");
                    System.out.println("Muito bem! Com essa vitória você garantiu o " + seuTime + " na fase de grupos Copa Libertabores do próximo ano, após esse feito seu técnico de colocou como capitão do time.");
                    pontos += 20;
                    System.out.println("Sua pontuação: " + pontos + "\n");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }while(perguntaN3 != "A" && perguntaN3 != "B" && perguntaN3 != "C" && perguntaN3 != "D");

        String perguntaN4 = "0";
        if(perguntaN2  == "D"){
          System.out.println("Depois da classificação do " + seuTime + " para a semifinal da Sul-Americana. Vocês jogarão contra o San Lorenzo em casa.");
          System.out.println("O primeiro jogo foi na Argentina e  terminou 2x1 para os argentinos! O jogo de volta será no seu estádio com a obrigação de ganhar!");
          System.out.println("Acerte a pergunta abaixo para saber se conseguiu reverter o placar negativo.");
          System.out.print("----------------------------------------------------------------------------------------------------------");
          System.out.println("\nEm que ano não teve uma final da Sul-Americana?\na) 2007\nb) 2013\nc) 2016\nd) 2021");
          do{
              perguntaN4 = sc.nextLine().toUpperCase();
              switch (perguntaN4) {
                  case "A":
                  case "B":
                  case "D":
                      System.out.println("Resposta incorreta. Em 2016 não ocorreu a final por causa do tragíco acidente aéreo da Chapecoense.");
                      System.out.println("Com essa derrota alguns torcedores começaram a falar que você sente pressão em jogos grandes, prove que eles estão errados.");
                      pontos -= 20;
                      System.out.println("Sua pontuação: " + pontos + "\n");
                      break;
                  case "C":
                      System.out.println("Resposta correta. Em 2016 não ocorreu a final por causa do tragíco acidente aéreo da Chapecoense.");
                      System.out.println("QUE ÓTIMO!! Você fez a sua melhor partida com a camisa do " + seuTime + " classificando o time para a final.");
                      pontos += 20;
                      System.out.println("Sua pontuação: " + pontos + "\n");
                      break;
                  default:
                      System.out.println("Opção inválida. Digite novamente.");
                      break;
              }
          }while(perguntaN4 != "A" && perguntaN4 != "B" && perguntaN4 != "C" && perguntaN4 != "D");
        }
        

        String perguntaN5;
        System.out.println("Na última rodada do campeonato brasileiro o " + seuTime + " prescisa muito dessa vitória para conseguir jogar a libertadores sem precisar da pergunta bônus.");
        System.out.println("Acerte a pergunta abaixo para jogar a Libertadores de 2024.");
        System.out.println("Qual foi o resultado da final do Campeonato Brasileiro de 1995 e quem foi o campeão?\na) Cruzeiro\nb) Santos\nc) Vasco\nd) Botafogo");

        do{
          perguntaN5 = sc.nextLine().toUpperCase();
    
          switch (perguntaN5) {
              case "A":
              case "B":
              case "C":
                  System.out.println("Resposta incorreta. O Botafogo foi campeão em 1995 contra o time do Santos.");
                  System.out.println("Mesmo com a derrota vamos te dar a chance de responder a última pergunta para recuperar os pontos perdidos.");
                  pontos -= 25;
                  System.out.println("Sua pontuação: " + pontos + "\n");
                  break;
              case "D":
                System.out.println("Resposta correta. O Botafogo foi campeão em 1995 contra o time do Santos.");
                System.out.println("QUE ÓTIMO!! Você conseguiu fazer com que o " + seuTime + " se classifica-se para a Libertadres de 2024.");
                pontos += 20;
                System.out.println("Sua pontuação: " + pontos + "\n");
                break;
              default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
          }
        }while(perguntaN5 != "A" && perguntaN5 != "B" && perguntaN5 != "C" && perguntaN5 != "D");
        
        String perguntaBonus;
        if(perguntaN4 == "C"){
          System.out.println("Agora vamos para jogar a final da Sul-Ameriacana, que vai ser em jogo uníco no estádio do maracanã, contra o Defensa y Justicia.");
          System.out.println("Acerte a pergunta abaixo para calar a boca dos torcedores que estão te chamando de pipoqueiro.");
          System.out.println("Quem foi o jogador mais jovem a marcar um gol na história da Copa Libertaores e qual era a sua idade na época?\na) Ângelo 16 anos\nb) Endrick 16 anos\nc) Luiz Araújo 20 anos\nd) Miguel Borja 22 anos");
          
          do{
            perguntaBonus = sc.nextLine().toUpperCase();
      
            switch (perguntaBonus) {
                case "B":
                case "C":
                case "D":
                    System.out.println("Resposta incorreta. O Ângelo é o jogador mais mais jovem a marcar na Libertaores.");
                    System.out.println("Com a derrota a diretoria do " + seuTime + " decidiu te demitir por não fazer uma boa temporada com o time, com essa notícia você decidiu encerrar a sua carreira.");
                    pontos -= 25;
                    System.out.println("Parabéns você concluiu o nosso jogo com o total: " + pontos + "pontos");
                    break;
                case "A":
                  System.out.println("Resposta correta. O Ângelo é o jogador mais mais jovem a marcar na Libertaores.");
                  System.out.println("É CAMPEÃO!! Você conseguiu fez o " + seuTime + " ser campeão e arrebentou na partida marcando 3 gols na partida.");
                  pontos += 20;
                  System.out.println("Parabéns você concluiu o nosso jogo com o total: " + pontos + "pontos");
                  break;
                default:
                      System.out.println("Opção inválida. Digite novamente.");
                      break;
            }
          }while(perguntaBonus != "A" && perguntaBonus != "B" && perguntaBonus != "C" && perguntaBonus != "D");
        }
        
      }
  }