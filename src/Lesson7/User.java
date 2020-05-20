package Lesson7;

import java.util.Objects;

public class User {
    int id;
    String name;

    Credential credential;

    public User() {
    }

    public User(int id, String name, Credential credential) { //obj. crendential
        this.id = id;
        this.name = name;
        this.credential = credential;}
    public User(int id, String name, String login, String password, String role) { //obj. crendential replaced by his fields
        this.id = id;
        this.name = name;
        this.credential =  new Credential(login,password,role);
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

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                getName().equals(user.getName()) &&
                getCredential().equals(user.getCredential());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCredential());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credential=" + credential +
                '}';
    }
}
