package com.devknela.maratonajava.introducao;

public class E03SwitchCase {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        var day = 4;

        switch (day) {
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil.");
                break;
            case 1, 7:
                System.out.println("Fim de semana.");
                break;
            default:
                System.out.println("Entrada inválida.");
        }

        String answer = switch (day) {
            case 2, 3, 4, 5, 6 -> "Dia útil.";
            case 1, 7 -> "Fim de semana.";
            default -> "Entrada inválida.";
        };

        System.out.println(answer);


    }
}
