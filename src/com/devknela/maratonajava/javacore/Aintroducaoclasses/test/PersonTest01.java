package com.devknela.maratonajava.javacore.Aintroducaoclasses.test;

import com.devknela.maratonajava.javacore.Aintroducaoclasses.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        // Criando um objeto da classe Person - variável de referência do tipo Person
        Person person1 = new Person();

        // Atributos da minha classe
        person1.name = "Lucas";
        person1.age = 24;
        person1.gender = 'M';

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.gender);
    }
}
