package lesson5;

import java.util.Objects;

public class User5 {
    private int id;
    private String name;


    public User5(){}


    public User5(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void action() {
        System.out.println("action from user" + id);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User5)) return false;
        User5 user5 = (User5) o;
        return getId() == user5.getId() &&
                getName().equals(user5.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "User5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


