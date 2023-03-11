/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class MaioresGastos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valoresString = sc.nextLine().split(" ");

        int[] valoresInteiros = new int [valoresString.length];
        for(int i = 0; i < valoresString.length; i++) {
            valoresInteiros[i] = Integer.parseInt(valoresString[i]);
        }
        
        int maior = 0;
        int indexMaior = 0;

        for(int i = 0; i < valoresInteiros.length; i++) {
            if(valoresInteiros[i] > maior) {
                maior = valoresInteiros[i];
                indexMaior = i;
            }
        }

        valoresInteiros[indexMaior] = 0;
        int segundoMaior = 0;

        for(int i = 0; i < valoresInteiros.length; i++) {
            if(valoresInteiros[i] > segundoMaior) {
                segundoMaior = valoresInteiros[i];
            }
        }

        int soma = maior + segundoMaior;
        System.out.println(soma);

        sc.close();
    }  
}
