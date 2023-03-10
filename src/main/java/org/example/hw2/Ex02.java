package org.example.hw2;

// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int[] array = inputArray();

        if(isAscendingSequence(array))
            System.out.println("Последовательность является возрастающей");
        else
            System.out.println("Последовательность НЕ является возрастающей");
    }

    /**
     * Метод определяет, является ли переданный массив возрастающей последовательностью
     * @param inpArray входной массив
     * @return true, если последовательность возрастающая и false, если нет.
     */
    public static boolean isAscendingSequence(int[] inpArray){
        for (int i = 0; i < inpArray.length-1; i++){
            if(inpArray[i] >= inpArray[i+1])
                return false;
        }
        return true;
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
}

