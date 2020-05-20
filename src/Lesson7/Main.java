package Lesson7;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        //new User(1, "name",new Credential("111", "2556","manager"));// юзер будет создан тогда когда проиниц айди и нейм и создадим креденшн и потом в креден перед значен
        Credential credential = new Credential("111", "2556","manager");
        User vasya = new User(1,"name", credential);//композиция
        User petya = new User(2,"petya",credential);

        Credential vasyaCredential = vasya.getCredential();
        System.out.println(credential== vasyaCredential);

       User user= new User (3,"aaaa","55555","66666","88888");// агрегация ( obj inside obj
        Credential userCredential = user.getCredential();
        System.out.println(user);

        Role role = Role.ADMIN;// call a specific obj admin or user or manager
        System.out.println(role);

        Role[] roles = Role.values();
        System.out.println(Arrays.toString(roles));// all values in Role
        System.out.println(Role.ADMIN.ordinal());// call our index number
    }
}
