/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class AlunoseNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valores = "";

        while(true) {
            String valor = sc.nextLine();
            if(valor.equals("-")) break;
            String[] dados = valor.split(" ");
            valores += dados[1] + " ";
        }

        String[] lista = valores.split(" ");
        int[] listaint = new int[lista.length];

        for(int i = 0; i < lista.length; i++) {
            listaint[i] = Integer.parseInt(lista[i]);
        }
        
        int maior = listaint[0];
        int menor = listaint[0];
        int soma = 0;
        int acima = 0;
        int abaixo = 0;

        for(int i = 0; i < listaint.length; i++) {
            if(listaint[i] > maior) {
                maior = listaint[i];
            }
            if(listaint[i] < menor) {
                menor = listaint[i];
            }

            if(listaint[i] >= 700) {
                acima += 1;
            }

            if(listaint[i] < 700) {
                abaixo += 1;
            }

            soma += listaint[i];
        }

        int media = soma / listaint.length;
        
        System.out.println(String.format("maior: %s\nmenor: %s\nmedia: %s\nacima: %s\nabaixo: %s", maior, menor, media, acima, abaixo));
        
        sc.close();

    }
}
