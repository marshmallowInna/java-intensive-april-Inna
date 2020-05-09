package lesson5.HomeTask;

public class Birds {

       private String name;
       private String fly;



    public Birds() {
    }
    public void eat(){
        System.out.println("nom-nom-nom");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", fly='" + fly + '\'' +
                '}';
    }
}

