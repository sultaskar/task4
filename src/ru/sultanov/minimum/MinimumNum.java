package ru.sultanov.minimum;

import java.util.Scanner;

public class MinimumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNum = sc.nextInt(); // Ввод первого числа
        System.out.println("Введите второе число");
        int secNum = sc.nextInt(); // Ввод второго числа
        int minNum = (firstNum < secNum) ? firstNum : secNum;// Сравнение чисел
        System.out.println(minNum + " - наименьшее число");
    }
}

