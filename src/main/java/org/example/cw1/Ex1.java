package org.example.cw1;

import java.util.Scanner;

// Возведение в степень

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(pow(x, n));
    }

    public static double pow(double x, int n){
        double result = 1;
        for(int i = 0; i < Math.abs(n); i++)
            result *= x;
        if(n >= 0)
            return result;
        else
            return 1 / result;
    }
}
