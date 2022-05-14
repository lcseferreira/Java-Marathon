package com.devknela.maratonajava.javacore.Bintroducaometodos.test;

import com.devknela.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        var sumResult = calculadora.somaDoisNumeros(2, 5);
        System.out.println(sumResult);

        try {
            var divResult = calculadora.divideDoisNumeros(5, 0);
            System.out.println(divResult);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
