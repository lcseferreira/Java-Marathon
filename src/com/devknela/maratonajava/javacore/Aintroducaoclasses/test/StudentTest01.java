package com.devknela.maratonajava.javacore.Aintroducaoclasses.test;

import com.devknela.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        // Criando um objeto da classe Person - variável de referência do tipo Person
        Student student1 = new Student();

        // Atributos da minha classe
        student1.name = "Lucas";
        student1.age = 24;
        student1.gender = 'M';

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);
    }
}
