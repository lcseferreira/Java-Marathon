package com.devknela.maratonajava.introducao;

public class E05For {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor
        int valorMax = 50;

        for (int i = 1; i <= valorMax; i++) {
            if (i > 25) break;
            System.out.println(i);
        }
    }
}
