package com.kneladev.maratonajava.B02POO.Bintroducaometodos.test;

import com.kneladev.maratonajava.B02POO.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        // settando valores
        estudante1.setName("Lucas");
        estudante1.setAge(24);
        estudante1.setGender('M');
    }
}
