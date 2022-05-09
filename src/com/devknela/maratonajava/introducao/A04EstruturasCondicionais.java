package com.devknela.maratonajava.introducao;

public class A04EstruturasCondicionais {
    public static void main(String[] args) {
        // Estrutura básica
        if (true) {
            System.out.println("Dentro do IF.");

        } else {
            System.out.println("Dentro do ELSE.");
        }

        System.out.println("Fora da estrutura condicional.");

        var age = 20;
        var isAuthorized = age >= 18;

        if (isAuthorized) {
            System.out.println("Pode comprar bebida alcólica.");
        } else {
            System.out.println("Não pode comprar bebida alcólica.");
        }
    }
}