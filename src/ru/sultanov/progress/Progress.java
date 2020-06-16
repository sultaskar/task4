package ru.sultanov.progress;

import java.util.Scanner;

public class Progress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int amount = sc.nextInt(); // Количество чисел
        System.out.println("Введите число-знаменатель");
        int step = sc.nextInt(); // Шаг, с которым будут складываться числа
        System.out.println("Какую прогрессию вывести? 1 - для арифметической"
                + ", 2 - для геометрической");
        int progr = sc.nextInt();
        int number = 1; //Стартовое число прогрессии
        if (progr == 1) {
            for (int i = 0; i < amount; i++) { // Арифметическая прогрессия
                System.out.print(number + " ");
                number += step;
            }
        }
        else {
            for (int i = 0; i < amount; i++) { //Геометрическая прогрессия
                System.out.print(number + " ");
                number *= step;

            }
        }
    }
}
