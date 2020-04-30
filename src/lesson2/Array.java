package lesson2;

import java.util.Arrays;

public class Array {
    /*8. создать массив из 10 чисел.
        -- вывести его в консоль
        -- вывести только парные числа
        -- вывести цифры у которых парный индекс
        -- при помощи цикла найти сумму всех чисел в массиве
        -- при помощи цикла найти среднее арифметическое число массива
        *** создать два числовых массива одинаковой длинны. Сложить их числа с одинаковыми индексами и вывести в консоль
        пример
        [1 ,2 ,3 , 4]
        [11,22,33,44]
        12 24 36 48 */
        public static void main(String[] args) {
            int[] numbers = {23, 24, 5, 6, 8, 7, 1, 9, 3, 4}; // переменная намберс ссылается на массив [10] сылочный тип данных
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(Arrays.toString(numbers));
            }
            System.out.println("------------------");

       /* for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            System.out.println("===============");

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("Index: " + i + "; Number: " + numbers[i]);
                }
                System.out.println("---------------");*/
            int sum = 0;
            for (int number1 : numbers) {
                sum = sum + number1;
                System.out.println(sum);
                System.out.println("===============");

                  /*  double average = 0;
                    if (numbers.length > 0) ;
                    {
                        double sum1 = 0;
                        for (int k = 0; k < numbers.length; k++) {
                            sum1 += numbers[k];
                        }
                        average = sum1 / numbers.length;
                    }
                    System.out.println(average);


                }
            }*/


            }
        }
    }

