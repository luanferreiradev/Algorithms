package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("Insira os números da matriz 2x2:");

        double[][] matriz = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextFloat();
            }
        }

        // Verificar se a matriz é inversível
        double determinant = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        if (determinant == 0) {
            System.out.println("A matriz não é inversível. O determinante é zero.");
            return;
        }

        // Normalizar a matriz dividindo pelo determinante
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] /= determinant;
            }
        }

        // Permutação entre o primeiro e o último elemento
        double temp = matriz[0][0];
        matriz[0][0] = matriz[1][1];
        matriz[1][1] = temp;

        // Troca de sinal na segunda diagonal
        matriz[0][1] = -matriz[0][1];
        matriz[1][0] = -matriz[1][0];

        // Imprimir a matriz resultante
        System.out.println("Matriz após a inversão:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
