/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class Dobroetriplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("dobro: " + num * 2 + ", triplo: " + num * 3);

        sc.close();
    }
}
