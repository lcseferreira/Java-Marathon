package com.devknela.maratonajava.javacore.Bintroducaometodos.test;

import com.devknela.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.setName("Lucas");
        estudante1.setAge(24);
        estudante1.setGender('M');

        // O método retorno o que for desse objeto (estudante1) em específico
        estudante1.print();

        Estudante estudante2 = new Estudante();

        estudante1.setName("Lara");
        estudante1.setAge(18);
        estudante1.setGender('F');

        // O método retorno o que for desse objeto (estudante2) em específico
        estudante1.print();
    }
}
