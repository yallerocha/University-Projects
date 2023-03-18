/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class Memoria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int certo = sc.nextInt();
        
        while(true) {
            int tentativa = sc.nextInt(); 
            if(tentativa == certo) {
                System.out.println("ACERTOU");
                break;
            }
            if(tentativa < certo){
                System.out.println("MENOR");
            } else if(tentativa > certo) {
                System.out.println("MAIOR");
            }
        }
        sc.close();
    }
}
