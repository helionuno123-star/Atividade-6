package org.example;
public class Exercicio04 {
    public static void main(String[] args) {
        int[][] m = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("digite o elemento [" + i + "][" + j + "]: "));
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println(" pares: " + pares);
    }
}