/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class Aviao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ideal = sc.nextInt();
        int medicao = sc.nextInt();

        int maior = ideal;
        int menor = medicao;

        if(ideal < medicao) {
            maior = medicao;
            menor = ideal;
        }

        int diferenca = maior - menor;
        
        while(true) {
            int novamedicao = sc.nextInt();

            if(novamedicao == ideal) {
              System.out.println("OK"); 
              break;
            }

            maior = ideal;
            menor = novamedicao;

            if(novamedicao > ideal) {
                maior = novamedicao;
                menor = ideal;
            }

            int novadiferenca = maior - menor;
           
            if(novadiferenca < diferenca) {
                System.out.println("ADEQUADO");
            } else {
                System.out.println("PERIGO");
            } 
            
            medicao = novamedicao;
            diferenca = novadiferenca;
        }
        
        sc.close();
    }
}
