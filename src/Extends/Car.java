package Extends;

public class Car {
    public String name;
    public String age;

    public void color(){
        System.out.println("what color");
    }

    public Car() {
    }

    public Car(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
