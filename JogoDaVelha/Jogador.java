
package JogoDaVelha;

import java.util.Scanner;

/**
 *
 * @author LucasMarcon
 * @date   01/06/2017
 */


public class Jogador {

     private final Scanner sc = new Scanner(System.in);
     private int x, y;
     
     public void acaoDoJogador() {
          
          System.out.println("");
          
          System.out.print("Digite a coordenada da linha: ");
          x = sc.nextInt();
          
          System.out.print("Digite a coordenada da coluna: ");
          y = sc.nextInt();
     }

     public int getX() {
          
          return x;
     }

     public int getY() {
          
          return y;
     }
}