package org.example.hw3;

// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int[] array = inputArray();
        int[] newArray = replaceNegativesToSumOfTwoDigits(array);

        System.out.println(Arrays.toString(newArray));
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
     * Метод заменяет отрицательные элементы переданного массива на сумму индексов двухзначных элементов
     * @param inpArray массив чисел, в котором нужно заменить отрицательные на сумму индексов двухзначных
     * @return новый массив с замененными элементами
     */
    public static int[] replaceNegativesToSumOfTwoDigits(int[] inpArray){
        int sumOfIndexes = 0;
        int[] modifiedArray = new int[inpArray.length];
        for(int i = 0; i < inpArray.length; i++) {
            if ((Math.abs(inpArray[i]) >= 10) && (Math.abs(inpArray[i]) <= 99))
                sumOfIndexes += i;
        }
        for(int i = 0; i < inpArray.length; i++){
            if(inpArray[i] < 0)
                modifiedArray[i] = sumOfIndexes;
            else
                modifiedArray[i] = inpArray[i];
        }
        return modifiedArray;
    }
}
