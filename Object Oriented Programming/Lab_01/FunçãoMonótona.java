/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class FunçãoMonótona {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        
        int valor1 = sc1.nextInt();
        int valor2 = sc1.nextInt();
        int valor3 = sc1.nextInt();
        int valor4 = sc1.nextInt();

        if(valor1 < valor2 && valor2 < valor3 && valor3 < valor4) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else {
            if(valor1 > valor2 && valor2 > valor3 && valor3 > valor4) {
                System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
            } else {
                System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
            }
        }

        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
    }
}
