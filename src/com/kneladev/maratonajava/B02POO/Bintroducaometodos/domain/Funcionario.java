package com.kneladev.maratonajava.B02POO.Bintroducaometodos.domain;

public class Funcionario {
    public String name;
    public int age;
    public double[] salaries;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries != null) System.out.println("Média dos salários: R$ " + averageSalary());
    }

    public double averageSalary() {
        if (salaries == null) return 0;

        double average, sum = 0;

        for (double salary : this.salaries) {
            sum += salary;
        }

        average = sum / this.salaries.length;
        return average;
    }
}
