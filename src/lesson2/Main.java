package lesson2;

import java.util.Arrays;

public class Main {
    /* 2. Создать класс Компьютер с конструкторами и методом toString
            Поля. производитель, диагональ монитора, объем памяти, частота процессора, модель процессора
            Доступный список производтелией  : HP Asus Lenovo
            Доступный model процессоров  : i3 i5 i7 core2duo
            Доступный список объемов памяти  : 2, 4, 8
            Создать 10 объектов, поместить их в массив.*/
        public static void main(String[] args) {
            Computer computer1 = new Computer("HP",1, 15, 2.0, 1120, "i3");
            Computer computer2 = new Computer("Lenovo", 2,15, 4.0, 5320, "i53");
            Computer computer3 = new Computer("Asus",3, 15, 6.0, 1020, "i7");
            Computer computer4 = new Computer("HP",4, 15, 8.0, 1140, "i81");
            Computer computer5 = new Computer("Lenovo", 5,15, 5.0, 2020, "i6");
            Computer computer6 = new Computer("HP",6, 15, 4.0, 2120, "i84");
            Computer computer7 = new Computer("HP",7, 15, 3.0, 3120, "i9");
            Computer computer8 = new Computer("Lenovo",8, 15, 2.0, 4120, "i13");
            Computer computer9 = new Computer("Asus",9, 15, 8.0, 1000, "i4");
            Computer computer10 = new Computer("HP",10, 15, 7.0, 3500, "i2");

            Computer[] computers = {computer1, computer2, computer3, computer4, computer5, computer6, computer7, computer8, computer9, computer10};
            System.out.println(computers.length);// количество массива их 10
            System.out.println(computers); // cell address
            System.out.println(Arrays.toString(computers));// with values

            /* 3. при помощи циклов for, foreach, while выести все объекты из задания 2.*/
            for (Computer computer : computers) {// iter + tab ( for each) для каждого текущего обьекта и в теле каждого массива мы можем измен.знач
                System.out.println(computer); // просматриваем каждый текущий обьект, для каждого от начала и до конца без всяких условий дополнительных это for each
            }
            System.out.println("----------------------------------------------------");

            for (int i = 0; i < computers.length; i++) { // itar, мы можем в любом порядке вытягивать значения
                Computer computer = computers[i]; // указываем индекс он у нас максимальный сдесь 9
                System.out.println(computer);
            }
            System.out.println("-----------------------------------------------------");

            int index = 0; //огласить индекс =0
            while (index < computers.length) { // пока индекс меньше нашей длинны массиваб
                System.out.println(computers[index]);// вывести каждый определ.элемент с определ.индексом
                index++;// индекс увеличиваем на 1
            }
            System.out.println("-----------");
            /*4. при помощи цикла for выести все объекты из задания 2 у которых производитель asus.*/
            for (int i = 0; i < computers.length; i++) {
                Computer computer = computers[i];
                if (computer.producer.equals("Asus")) {
                    System.out.println(computer);
                }

            }

            System.out.println("////////////////");
            /*   5. при помощи цикла foreach выести все объекты из задания 2 у которых i3 процессор.*/
            for (Computer computer : computers) {
                if (computer.model.equals("i3")) {
                    System.out.println(computer);
                }
            }
            System.out.println("----------------");
            /*  6. при помощи цикла while выести все объекты из задания 2 у которых объем памяти более 4гб.*/

            int j = 0;
            while (j < computers.length) {
                Computer computer = computers[j];
                if (computer.volume > 4) {
                    System.out.println(computer);
                }
                j++;
            }
            System.out.println("==========================");
            for (int i = 0; i < computers.length; i++) {
                Computer computer = computers[i];
                if(computer.volume >= 4 && computer.producer.equals("HP")){
                    System.out.println(computer);
                }
            }
        }


    }

    /*7. при помощи любого цикла  выести все объекты из задания 2 у которых объем памяти более 4гб и производитель HP.  */

