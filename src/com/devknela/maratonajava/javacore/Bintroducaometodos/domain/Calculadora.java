package com.devknela.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {

    // estrutura: modificadorDeAcesso retorno nomeDoMétodo(parâmetros) {o que ele faz}
    public int somaDoisNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtraiDoisNumeros(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicaDoisNumeros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public double divideDoisNumeros(double numero1, double numero2) {
        if (numero2 != 0) return numero1 / numero2;

        throw new ArithmeticException("Can't divide by 0.");
    }

    // esse método recebe tipos primitivos como parâmetros
    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do meu método - número 1: " + numero1 + ", número 2: " + numero2);
    }

    public void arraySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    // varargs => o que eu receber, o Java irá transformar em um array
    public void varargsSum(int... args) {
        int sum = 0;
        for (int number : args) {
            sum += number;
        }
        System.out.println(sum);
    }
}
