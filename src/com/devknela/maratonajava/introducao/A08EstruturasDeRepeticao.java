package com.devknela.maratonajava.introducao;

public class A08EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while: enquanto...
        var count = 0;

        while (count < 10) {
            System.out.println(++count);
        }

        // do while: faça x enquanto...
        do {
            System.out.println("Dentro do 'do while'");
        } while (count < 10);

        // for: para...
        for (int i = 1; i < 101; i++) {
            System.out.println("Contando: " + i);
        }
    }
}
