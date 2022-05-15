package com.kneladev.maratonajava.B02POO.Bintroducaometodos.test;

import com.kneladev.maratonajava.B02POO.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.name = "Lucas";
        funcionario.age = 24;
        funcionario.salaries = new double[]{1220.12, 2000.26, 3244.20};

        funcionario.printData();
    }
}
