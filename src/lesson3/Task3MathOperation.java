package lesson3;

import lesson2.Computer;

import java.util.Random;

public class Task3MathOperation {
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int plusMinos(String action, int a, int b) {
        int result = 0;
        if (action.equals("+")) {
            result = a + b;
        } else if (action.equals("-")) {
            result = a - b;
        }
        return result;
    }

    public static int action(String action, int z, int s) {
        if (action.equals("+")) {
            return z + s;
        } else if (action.equals("-")) {
            return z - s;
        } else {
            return 0;

        }
    }

    /*3. Создайте метод который генерирует массив при желании можете создать метод
    который генерирует массив рандомных чисел размером в 10 элементов с рандомными значениями
     */
    public static int[] arrayGenerator(int bound) {  // create array
        int[] ints = {123, 85, -15, 7436, 32};
        return ints;
    }

    /*4. Создайте метод который принимает массив и находит из него максимальное значение*/
    public static int maxFromArray(int[] array) { // передача массива в метод
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int minFromArray(int[] array) { // передача массива в метод
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    /*6. Создайте метод который принимает массив и находит сумму всех элементов.*/

    public static int sumElement(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    /*7. Создайте метод который принимает массив и находит среднеарифметическое и возвращает его.*/
    public static double average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = sum / array.length;
        return average;
    }
    /*8. Используя класс и спрашиваю домашнего задания которые характеризирует компьютер
     создайте массив из 10 различных компьютеров. Создайте метод который будет принимать массив этих компьютеров и
     выводить только те объекты объем оперативной памяти которых больше чем 4 ГБ.*/

  public Computer[] pcFilter(Computer[] computers) {
      for (Computer computer : computers) {
          if (computer.volume > 4) {
              System.out.println(computer);
          }
      }

/*9. Используя предыдущее задание усовершенствовать его. Теперь метод должен принимать массив объектов и числовое
значение которая
характеризует значение объема оперативной памяти
которая будет является ограничителем для выведения объектов с соответствующем объемом памяти.*/

      public Computer[] pcFilter (Computer[]computers,int CPU){
          for (Computer computer : computers) {
              if (computer.volume > CPU) {
                  System.out.println(computer);
              }
          }

      }

      /*10*/
  }
