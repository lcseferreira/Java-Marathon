package com.devknela.maratonajava.B01Introducao;

public class A09Arrays {
    public static void main(String[] args) {
        // Arrays unidimensiosais: arrays são referências para espaços em memória
        // Variáveis do tipo ref (arrays são considerados objetos na memória)
        int[] idades = new int[3];

        int idade1 = 14;
        int idade2 = 53;
        int idade3 = 26;

        idades[0] = idade1;
        idades[1] = idade2;
        idades[2] = idade3;

        for (int idade :
                idades) {
            System.out.println(idade);
        }
    }
}
