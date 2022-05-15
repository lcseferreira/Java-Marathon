package com.kneladev.maratonajava.B02POO.Aintroducaoclasses.test;

import com.kneladev.maratonajava.B02POO.Aintroducaoclasses.domain.Car;

public class CarExercise01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        Car[] cars = new Car[2];

        car1.name = "Palio";
        car1.model = "Casual";
        car1.age = 2003;

        car2.name = "Civic";
        car2.model = "Sport";
        car2.age = 2014;

        cars[0] = car1;
        cars[1] = car2;

        for (Car car : cars) {
            System.out.println("Name: " + car.name + " - Model: " + car.model + " - Age: " + car.age);
        }
    }
}
