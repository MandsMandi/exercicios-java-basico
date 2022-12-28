package Arrays;

// Mostra o vetor escrito no programa ao contrário.

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int count=vetor.length;
        
        for (int i=count-1;i>=0;i--) {
            System.out.println(vetor[i]);
        }

    }
}
