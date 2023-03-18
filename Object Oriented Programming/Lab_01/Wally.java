/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class Wally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String[] nomes = sc.nextLine().split(" ");
            if(nomes[0].equals("wally")) break;

            String nome = "?";
            for(int i = 0; i < nomes.length; i++) {
                if(nomes[i].length() == 5) {
                    nome = nomes[i];
                }
            }

            System.out.println(nome);
            
        }
        sc.close();
    }
}