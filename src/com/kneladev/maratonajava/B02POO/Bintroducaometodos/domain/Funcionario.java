package com.kneladev.maratonajava.B02POO.Bintroducaometodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salaries;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

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
