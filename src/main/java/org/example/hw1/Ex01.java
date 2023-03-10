package org.example.hw1;

import java.util.Scanner;

//  Дана последовательность N целых чисел. Найти сумму простых чисел.

public class Ex01 {
    public static void main(String[] args) {
        int[] array = inputArray();

        System.out.println("Сумма простых элементов равна " + sumOfPrimes(array));
    }

    /**
     * Метод для создания и заполнения массива
     * @return заполненный массив
     */
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");

        int sizeOfArray = scanner.nextInt();
        int[] newArr = new int[sizeOfArray];

        System.out.println("Введите числа: ");
        for(int i = 0; i < sizeOfArray; i++)
            newArr[i] = scanner.nextInt();

        return newArr;
    }

    /**
     * Метод определяет является ли число простым
     * @param number число
     * @return true, если число является простым и false, если нет
     */
    public static boolean isPrime(int number){
        if(number > 2) {
            if(number % 2 != 0) {
                for (int i = 3; i <= Math.sqrt(number); i += 2)
                    if (number % i == 0) return false;
            }
            else return false;
        }
        else if (number == 1)
            return false;
        return true;
    }

    /**
     * Метод складывает все простые члены переданного массива
     * @param inputArray Массив, в котором нужно сложить простые числа
     * @return Сумма простых членов массива
     */
    public static int sumOfPrimes(int[] inputArray) {
        int result = 0;

        for (int j : inputArray) {
            if (isPrime(j))
                result += j;
        }
        return result;
    }
}
