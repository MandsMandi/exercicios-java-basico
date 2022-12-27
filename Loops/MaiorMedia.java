package Loops;

import java.util.Scanner;

//Programa recebe 5 valores do usurário e entrega os valores de soma e média.

public class MaiorMedia {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma=0; 
        int media;
        int count = 1;

        do {
            System.out.println("Digite o número de posição " + count + " : ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;   
            ++count;
            soma = soma + numero;  
        } while (count<6);

        System.out.println("O maior número é: " + maior);
        media = (soma/5);
        System.out.println("A média é: " + media);

    }
}
