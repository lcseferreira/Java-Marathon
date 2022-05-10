package com.devknela.maratonajava.introducao;

public class E02EstruturasCondicionais {
    public static void main(String[] args) {
        var salary = 60000D;
        var percent = 0.0D;
        var tax = 0.0D;

        if (salary > 0 && salary < 34713) {
            percent = 0.0970;
        } else if (salary >= 34713 && salary < 68508) {
            percent = 0.3735;
        } else if (salary >= 68508) {
            percent = 0.4950;
        } else {
            System.out.println("Entrada inválida!");
        }

        tax = salary * percent;
        System.out.println(tax);
    }
}
