package com.kneladev.maratonajava.B02POO.Bintroducaometodos.test;

import com.kneladev.maratonajava.B02POO.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] arrayNumber = {1, 5, 7, 9, 3, 5};

        calculadora.arraySum(arrayNumber);

        calculadora.varargsSum(arrayNumber);

        calculadora.varargsSum(1, 4, 6, 7, 4);
    }
}
