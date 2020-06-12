package ru.sultanov.multtable;


public class MultTable {
    public static void main(String[] args) {
        int[][] mult= new int[10][10]; // Создание массива 10x10 для охвата всех множителей таблицы
        for (int i=0; i < mult.length; i++) { // Цикл первого множителя
            for (int j=0; j < mult.length; j++) { //Цикл второго множителя
                mult[i][j] = i*j;
                System.out.println(i + " * " + j + " = " + mult[i][j]); // Вывод одной строки таблицы
            }
        }

    }
}
