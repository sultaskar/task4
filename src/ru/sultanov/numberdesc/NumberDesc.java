package ru.sultanov.numberdesc;

import java.util.Scanner;

public class NumberDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите число");
        int Number = sc.nextInt();
        if (Number == 0){
            System.out.print(Number + " - нулевое, ");
        }
        else if (Number > 0) {
            System.out.print(Number + " - положительное, ");
        }
        else {
            System.out.print(Number + " - отрицательное, ");
        }
        if (Number % 2 == 0) {
            System.out.print("четное");
        }
        else {
            System.out.print("нечетное");
        }

    }
}
