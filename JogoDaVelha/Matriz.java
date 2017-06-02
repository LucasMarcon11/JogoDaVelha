
package JogoDaVelha;

/**
 *
 * @author LucasMarcon
 * @date   01/06/2017
 */


public class Matriz {
     
     private final String[][] matriz = new String[3][3];

     public void iniciaMatriz() {
          
          for (int i = 0; i < 3; i++) {
               
               for (int j = 0; j < 3; j++) {
                    
                    matriz[i][j] = " ";
               }
          }
     }
     
     public void exibeMatriz() {
          
          System.out.println("");
               
          for (int j = 0; j < 3; j++) {

               System.out.printf("			 %s | %s | %s ", matriz[j][0], matriz[j][1], matriz[j][2]);

               if (j <= 1) {

                    System.out.printf("\n			---|---|--- \n");
               }
          }

          System.out.println("");
     }
     
     public boolean verificaJogada(int linha, int coluna, int jogadorDaVez) {
          
          if ((linha < 3) && (coluna < 3)) {
               
               if (matriz[linha][coluna] .equals(" ")) {

                    if (jogadorDaVez == 1) {
                         
                         matriz[linha][coluna] = "X";
                         verificaVencedor(jogadorDaVez, "X");
                         
                         return true;
                    } else {
                         
                         matriz[linha][coluna] = "O";
                         verificaVencedor(jogadorDaVez, "O");
                         
                         return true;
                    } 
               } else {
                    
                    System.out.println("Já há uma jogada nessa posição!");
                    return false;
               }
          } else {
               
               System.out.println("Jogada inválida!");
               return false;
          }
     }
     
     public void verificaVencedor(int jogadorDaVez, String simbolo) {
          
          int resultado = verificaLinhas(simbolo);
          
          if (resultado > 0) {
               
               System.out.printf("\nO jogador %d venceu!", jogadorDaVez);
               
               exibeMatriz();
               System.exit(0);
          } else {
               
               int aux = 0;
               
               for (int i = 0; i < 3; i++) {
                    
                    for (int j = 0; j < 3; j++) {
                         
                         if (!" ".equals(matriz[i][j])) {
                              
                              aux++;
                         }
                    }
               }
               
               if (aux == 9) {
                    
                    System.out.println("\nHouve um empate!");
                    exibeMatriz();
                    
                    System.exit(0);
               }
          }
     }
     
     private int verificaLinhas(String simbolo) {
          
          int qt = 0;
          
          for (int i = 0; i < 3; i++) {
               
               if ((matriz[i][0].equals(simbolo)) && (matriz[i][1].equals(simbolo)) && (matriz[i][2].equals(simbolo))) {
                    
                    qt++;
                    break;
               }
          }
          
          return (qt > 0) ? qt : verificaColunas(simbolo);
     }
     
     private int verificaColunas(String simbolo) {
          
          int qt = 0;
          
          for (int i = 0; i < 3; i++) {
               
               if ((matriz[0][i].equals(simbolo)) && (matriz[1][i].equals(simbolo)) && (matriz[2][i].equals(simbolo))) {
                    
                    qt++;
                    break;
               }
          }
          
          return (qt > 0) ? qt : verificaDiagonalPrimaria(simbolo);
     }
     
     private int verificaDiagonalPrimaria(String simbolo) {
          
          int qt = 0;
          
          if ((matriz[0][0].equals(simbolo)) && (matriz[1][1].equals(simbolo)) && (matriz[2][2].equals(simbolo))) {
                    
               qt++;
          }
          
          return (qt > 0) ? qt : verificaDiagonalSecundaria(simbolo);
     }
     
     private int verificaDiagonalSecundaria(String simbolo) {
          
          int qt = 0;
          
          if ((matriz[0][2].equals(simbolo)) && (matriz[1][1].equals(simbolo)) && (matriz[2][0].equals(simbolo))) {
                    
               qt++;
          }
          
          return qt;
     }
}