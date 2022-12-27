package Loops;

import java.util.Scanner;

// O programa pede o valor de uma nota para o usuário. O valor da nota deve ser um número inteiro entre 0 e 10.

public class Notas {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int nota;
    System.out.println("Nota: ");
    nota = scan.nextInt();

    while(nota<0 || nota>10) {
        System.out.println("Nota inválida. Digite novamente.");
        nota = scan.nextInt();

    }


}
}
