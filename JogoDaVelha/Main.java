
package JogoDaVelha;

/**
 *
 * @author LucasMarcon
 * @date   01/06/2017
 */


public class Main {

     public static void main(String[] args) {
          
          Jogo j = new Jogo();
          Jogador jogador1 = new Jogador();
          Jogador jogador2 = new Jogador();
          
          int controlaJogadorDaVez = 1;
          
          j.iniciaMatriz();
          
          while (true) {
               
               if (controlaJogadorDaVez == 1) {
                    
                    j.acaoDoJogador(jogador1, controlaJogadorDaVez);
                    controlaJogadorDaVez++;
               } else {
                    
                    j.acaoDoJogador(jogador2, controlaJogadorDaVez);
                    controlaJogadorDaVez--;
               }
          }
     }
}