/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char operacao = sc.next().charAt(0);

        if(operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/') {
            float valor1 = sc.nextFloat();
            float valor2 = sc.nextFloat();

            if(operacao == '/' && valor2 == 0) {
                System.out.println("ERRO");

            } else if(operacao == '+') {
                    float resultado = valor1 + valor2;
                    System.out.println("RESULTADO: " + resultado);

                } else if(operacao == '-') {
                    float resultado = valor1 - valor2;
                    System.out.println("RESULTADO: " + resultado);

                } else if(operacao == '*') {
                    float resultado = valor1 * valor2;
                    System.out.println("RESULTADO: " + resultado);
                    
                } else {
                    float resultado = valor1 / valor2;
                    System.out.println("RESULTADO: " + resultado);
                }

        } else {
            System.out.println("ENTRADA INVALIDA");
        }

        sc.close();
    }
}
