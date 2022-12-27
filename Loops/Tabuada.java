package Loops;

import java.util.Scanner;

// Programa calcula a tabuada de 1 até 10 de um número inteiro escolhido pelo usuário.

public class Tabuada {
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Tabuada: ");

    int tabuada = scan.nextInt();

    System.out.println("Tabuada de " + tabuada);

    for (int i=1;i<=10;i++) {
    System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
    }
        
    }
}
