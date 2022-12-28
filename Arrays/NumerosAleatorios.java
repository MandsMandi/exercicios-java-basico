package Arrays;

import java.util.Random;

import javax.swing.BoundedRangeModel;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i=0; i< numerosAleatorios.length; i++) {
           int numero = random.nextInt(100);
            numerosAleatorios[i]=numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Números sucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero+1 + " ");
        }


    }
}
