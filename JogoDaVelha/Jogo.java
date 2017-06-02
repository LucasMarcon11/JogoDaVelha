
package JogoDaVelha;

/**
 *
 * @author LucasMarcon
 * @date   01/06/2017
 */


public class Jogo {

     private final Matriz matriz = new Matriz();
     private int linha, coluna;
     
     public void iniciaMatriz() {
          
          matriz.iniciaMatriz();
     }
     
     public void exibeMatriz() {
          
          matriz.exibeMatriz();
     }
     
     public void acaoDoJogador(Jogador jogador, int jogadorDaVez) {
          
          exibeMatriz();
          jogador.acaoDoJogador();
          linha = jogador.getX();
          coluna = jogador.getY();
          verificaJogada(jogador, jogadorDaVez);
     }
     
     private void verificaJogada(Jogador jogador, int jogadorDaVez) {
          
          if (matriz.verificaJogada(linha, coluna, jogadorDaVez) == false) {
               
               acaoDoJogador(jogador, jogadorDaVez);
          } 
     }
}