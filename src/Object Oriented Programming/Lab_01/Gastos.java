/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Yalle Rocha Silva - 121110387
 */

import java.util.Scanner;

public class Gastos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String[] meses = sc.nextLine().split(" ");
    String[] valores = sc.nextLine().split(" ");
    
    String busca = sc.nextLine();
    
    for (int i = 0; i < meses.length; i++) {
        if(meses[i].equals(busca)) {
            System.out.println(valores[i]);
            }
        }

    sc.close();
    }
}
