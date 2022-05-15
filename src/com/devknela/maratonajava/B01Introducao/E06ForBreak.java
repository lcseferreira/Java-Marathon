package com.devknela.maratonajava.B01Introducao;

public class E06ForBreak {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas x ele pode ser parcelado
        // Condição: valorParcela >= 1000

        var valorCarro = 65000D;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            var valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) break;

            System.out.println("Parcela " + parcela + " - R$ " + valorParcela);
        }
    }
}
