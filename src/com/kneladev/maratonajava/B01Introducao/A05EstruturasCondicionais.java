package com.kneladev.maratonajava.B01Introducao;

public class A05EstruturasCondicionais {
    public static void main(String[] args) {
        var age = 19;

        // Estrutura condicional com elseif
        var isInfantil = age > 0 && age < 15;
        var isJuvenil = age >= 15 && age < 18;
        var isAdulto = age >= 18;

        if (isInfantil) {
            System.out.println("Categoria infantil.");
        } else if (isJuvenil) {
            System.out.println("Categoria juvenil.");
        } else if (isAdulto) {
            System.out.println("Categoria adulta.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
