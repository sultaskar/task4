package ru.sultanov.progress;

import java.util.Scanner;

public class Progress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int amount = sc.nextInt(); // Количество чисел
        System.out.println("Введите число-знаменатель");
        int step = sc.nextInt(); // Шаг, с которым будут складываться числа
        int number = 0; // Стартовое значение последовательности
        for (int i=0; i < amount; i++) {
            number+= step;
            System.out.print(number + " ");
        }
    }
}
