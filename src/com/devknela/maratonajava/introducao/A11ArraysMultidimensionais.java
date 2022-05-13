package com.devknela.maratonajava.introducao;

public class A11ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1, 2, 3 meses
        // 31, 28, 31 dias

        int[][] days = new int[1][3];

        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
    }
}
