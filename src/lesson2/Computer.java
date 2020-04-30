package lesson2;

public class Computer {
 /* 2. Создать класс Компьютер с конструкторами и методом toString
      Поля. производитель, диагональ монитора, объем памяти, частота процессора, модель процессора
       Доступный список производтелией  : HP Asus Lenovo
       Доступный список процессоров  : i3 i5 i7 core2duo
        Доступный список объемов памяти  : 2, 4, 8
         Создать 10 объектов, поместить их в массив.*/
        String producer;
        int monitor;
        double volume;
        int CPU;
        String model;

        public Computer(){

        }

        public Computer(String producer, int monitor, double volume, int CPU, String model) {
            this.producer = producer;
            this.monitor = monitor;
            this.volume = volume;
            this.CPU = CPU;
            this.model = model;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "producer='" + producer + '\'' +
                    ", monitor=" + monitor +
                    ", volume=" + volume +
                    ", CPU='" + CPU + '\'' +
                    ", model=" + model +
                    '}';
        }
    }
