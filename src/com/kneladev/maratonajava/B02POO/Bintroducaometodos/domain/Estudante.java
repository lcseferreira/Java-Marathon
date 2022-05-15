package com.kneladev.maratonajava.B02POO.Bintroducaometodos.domain;

public class Estudante {
    private String name;
    private Integer age;
    private Character gender;

    public void print() {
        // this => vai retornar algo que é próprio do objeto (this = esse/desse)
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public Integer getAge() {
        return age;
    }

    // setter
    public void setAge(Integer age) {
        if (age < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.age = age;
    }

    // getter
    public Character getGender() {
        return gender;
    }

    // setter
    public void setGender(Character gender) {
        this.gender = gender;
    }
}
