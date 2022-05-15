package com.devknela.maratonajava.javacore.Bintroducaometodos.domain;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}
