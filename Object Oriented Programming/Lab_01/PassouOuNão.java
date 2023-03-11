/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Locale;
import java.util.Scanner;

public class PassouOuNão {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        float num = sc.nextFloat();
        float num2 = sc.nextFloat();

        float media = (num + num2) / 2;

        if(media >= 7) {
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }

        sc.close();

    }
}
