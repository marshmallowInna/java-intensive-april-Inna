package lesson2;

import java.util.Objects;

public class Computer {
    /* 2. Создать класс Компьютер с конструкторами и методом toString
             Поля. производитель, диагональ монитора, объем памяти, частота процессора, модель процессора
              Доступный список производтелией  : HP Asus Lenovo
              Доступный список процессоров  : i3 i5 i7 core2duo
               Доступный список объемов памяти  : 2, 4, 8
                Создать 10 объектов, поместить их в массив.*/
    String producer;
    int id;
    int monitor;
    public double volume;
    int CPU;
    String model;

    public Computer() {

    }

    public Computer(String producer, int id, int monitor, double volume, int CPU, String model) {
        this.producer = producer;
        this.id = id;
        this.monitor = monitor;
        this.volume = volume;
        this.CPU = CPU;
        this.model = model;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return id == computer.id &&
                monitor == computer.monitor &&
                Double.compare(computer.volume, volume) == 0 &&
                CPU == computer.CPU &&
                producer.equals(computer.producer) &&
                model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, id, monitor, volume, CPU, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", id=" + id +
                ", monitor=" + monitor +
                ", volume=" + volume +
                ", CPU=" + CPU +
                ", model='" + model + '\'' +
                '}';
    }
}


