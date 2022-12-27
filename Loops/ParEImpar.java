package Loops;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

// O programa recebe uma quantidade "n" de números inteiros do usuário e diz quantos são pares e quantos são ímpares.

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros=0;
        int count=1;
        int numero;
        int quantidadePares=0;
        int quantidadeImpares=0;

        System.out.println("Quantidade de números desejada: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite o número de posição " + count );
            numero = scan.nextInt();
            ++count;
            if (numero %2 == 0)
            quantidadePares++;
            else 
            quantidadeImpares++;
        } while (count<=quantidadeNumeros);
    
        System.out.println("A quantidade de números ímpares é:  " + quantidadeImpares );
        System.out.println("A quantidade de números pares é:  " + quantidadePares );

    }
}
