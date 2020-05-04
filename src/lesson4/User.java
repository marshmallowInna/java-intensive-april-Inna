package lesson4;

import java.util.Objects;

public class User {

  // private String producer;
   private int id;
   private String name;
   private int age;

   public User(int id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      User user = (User) o;
      return id == user.id &&
              age == user.age &&
              name.equals(user.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, age);
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
   //private int monitor;
   //private double volume;
  // private int CPU;
   //private String model;

}
