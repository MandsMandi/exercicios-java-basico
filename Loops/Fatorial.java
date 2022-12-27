package Loops;

import java.util.Scanner;

//O programa calcula o fatorial de um número dado pelo usuário.

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultadoFatorial = 1;
        System.out.println("Digite o número desejado: ");
        int numero = scan.nextInt();

        for (int i=1;i<=numero;i++) {
            resultadoFatorial=resultadoFatorial*i;
        }

            System.out.println("O resultado é: " + resultadoFatorial);

    }
}
