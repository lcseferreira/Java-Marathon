package com.devknela.maratonajava.javacore.Bintroducaometodos.test;

import com.devknela.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] arrayNumber = {1, 5, 7, 9, 3, 5};

        calculadora.arraySum(arrayNumber);

        calculadora.varargsSum(arrayNumber);

        calculadora.varargsSum(1, 4, 6, 7, 4);
    }
}
