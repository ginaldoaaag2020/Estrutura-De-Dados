import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
        
        // Lendo o número de linhas e colunas da matriz
        try (Scanner entrada = new Scanner(System.in)) {
            // Lendo o número de linhas e colunas da matriz
            System.out.print("Digite o número de linhas e colunas da matriz: ");
            int n = entrada.nextInt();
            
            // Criando a matriz n x n e preenchendo-a com valores sequenciais
            int[][] matriz = new int[n][n];
            int valor = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = valor;
                    valor++;
                }
            }
            
            // Imprimindo a matriz na tela
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
