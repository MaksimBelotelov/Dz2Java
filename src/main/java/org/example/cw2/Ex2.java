package org.example.cw2;

import java.util.Scanner;

// Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.

public class Ex2 {
    public static void main(String[] args) {
        int sizeOfArray = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.println("Введите числа: ");
        for(int i = 0; i < sizeOfArray; i++)
            array[i] = scanner.nextInt();
        System.out.println("Сумма элементов равна " + sumFive(array));
    }

    public static int sumFive(int[] arr) {
        int sumOfFive = 0;

        for(int i = 1; i < arr.length; i++){
            if((arr[i] % 10 == 5) && ((arr[i-1] % 2) == 0)){
                sumOfFive += arr[i];
            }
        }
        return sumOfFive;
    }
}
