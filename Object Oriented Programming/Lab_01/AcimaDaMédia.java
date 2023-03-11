/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class AcimaDaMédia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");

        int soma = 0;
        for(int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            soma += num;
        }

        float media = soma / array.length;

        String resultado = "";
        for(int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            if(num > media) {
                resultado += array[i] + " ";      
            }
        }

        System.out.println(resultado.strip());

        sc.close();
    }
}