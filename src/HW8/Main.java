package HW8;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Category category = new Category ("garden", 11258);
        Category build = new Category ("garden", 11258);

        ArrayList<Product> products = new ArrayList<>() ;
        products.add(new Product("mango" , 4000 ,category));// fill our product-> go to class product and fill it
        products.add(new Product("orange", 25, category));
        products.add(new Product("brick", 8, build));
        products.add(new Product("chain",150,build));

        User user = new User(1,"SSSS",products);

        Set<Guest> guests = new TreeSet<>();
        guests.add(new Guest(1,"ddddd"));
        guests.add(new Guest(2,"eeeee"));
        guests.add(new Guest(4,"kkkkkk"));
        guests.add(new Guest(5,"xxxxxx"));
        System.out.println(guests.size());
        System.out.println(guests);


    }
}
