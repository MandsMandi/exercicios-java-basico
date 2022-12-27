package Loops;
import java.util.Scanner;

//O programa recebe nome e idade do usuário, podendo ser finalizado quando o usuário responder "0" no campo nome.

public class NomeEIdade {
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    String nome;
    int idade;

    while(true) {

        System.out.println("Nome: ");
        nome = scan.next();

        if(nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = scan.nextInt();

    }
  
    System.out.println("Parou");
}
} 