package org.example;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("digite o elemento [" + i + "][" + j + "]: "));
            }
        }

        System.out.println("saída:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}