package org.example.cw3;

import java.util.Scanner;

// Найти количество пар соседних элементов, где первый элемент вдвое больше второго.

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Введите элементы массива: ");
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(pairsOfDb(arr));
    }

    public static int pairsOfDb(int inpArr[]) {
        int counter = 0;
        for(int i = 0; i < inpArr.length-1; ++i){
            if(inpArr[i+1] * 2 == inpArr[i])
                counter++;
        }
        return counter;
    }
}
