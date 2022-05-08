package com.devknela.maratonajava.introducao;

public class A03Operadores {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators");
        // Operadores Aritméticos: +, -, *, /, %
        var number01 = 12F;
        var number02 = 22F;

        var sum = number02 + number01;
        var subtraction = number02 - number01;
        var multiplication = number02 * number01;
        var division = number02 / number01;
        var rest = number02 % number01;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(rest);

        System.out.println();
        System.out.println("Relational Operators");
        // Operadores Relacionais: <, >, <=, >=, ==, !=
        var isGreaterThan = number01 > number02;
        var isLessThan = number01 < number02;
        var isEquals = number01 == number02;
        var isDifferent = number01 != number02;

        System.out.println(isGreaterThan);
        System.out.println(isLessThan);
        System.out.println(isEquals);
        System.out.println(isDifferent);

        System.out.println();
        System.out.println("Logical Operators");
        // Operadores Lógicos: && (E), || (OU), ! (NOT)
        var age = 24;
        var salary = 2000F;
        var isInTheLaw = age > 30 && salary >= 4612;

        if (isInTheLaw) System.out.println("You are in the law.");
        else System.out.println("You are out the law.");

        var totalCC = 200F;
        var totalCP = 10000F;
        var PS5 = 4799F;
        var canIBuyAPS5 = totalCC > PS5 || totalCP > PS5;

        if (canIBuyAPS5) System.out.println("I can buy a PS5");
        else System.out.println("I can't buy a PS5");

        System.out.println();
        System.out.println("Assignment Operators");
        // Operadores de Atribuição: +=, -=, *=, /=
        var bonus = 1800F;
        bonus *= 1.2;

        System.out.println(bonus);

        var contador = 1;
        contador++;

        System.out.println(contador);
    }
}
