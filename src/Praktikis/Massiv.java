package Praktikis;

import java.util.Scanner;
import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        int n = 0;
        int res = 0;
        int res1 = 0;
        System.out.println("Пожалуйста, введите четное положительное число");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Число нечетное, введите заново");
            return;
        }
        if (n < 0) {
            System.out.println("Число отрицательное, введите заново");
            return;

        }

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11) - 5;

            if (i <= array.length / 2 - 1) {
                res += Math.abs(array[i]);
            } else {
                res1 += Math.abs(array[i]);
            }
            if (res > res1) {
                System.out.println("Сумма модулей первой половины массива больше второй половины массива");


            }
            if (res1 > res) {
                System.out.println("Сумма модулей второй половины больше первой половины массива");


            }

        }
        System.out.println("Массив:" + Arrays.toString(array));


    }


}
